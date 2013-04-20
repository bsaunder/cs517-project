package net.bryansaunders.dss.service;

import java.util.List;

import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import net.bryansaunders.dss.dao.BoatDao;
import net.bryansaunders.dss.dao.ClassroomDao;
import net.bryansaunders.dss.dao.ResourceDao;
import net.bryansaunders.dss.dao.TrainingPoolDao;
import net.bryansaunders.dss.model.Boat;
import net.bryansaunders.dss.model.Classroom;
import net.bryansaunders.dss.model.Resource;
import net.bryansaunders.dss.model.TrainingPool;

import org.jboss.logging.Logger;

/**
 * Service Class for managing Resources.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Stateless
public class ResourceService {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(ResourceService.class);

	/**
	 * 
	 */
	@Inject
	private BoatDao boatDao;

	@Inject
	private ClassroomDao classroomDao;

	@Inject
	private TrainingPoolDao poolDao;

	/**
	 * Generic Resource DAO.
	 */
	@Inject
	private ResourceDao resourceDao;

	/**
	 * EJB Context for Transaction Rollback.
	 */
	@javax.annotation.Resource
	private EJBContext context;

	/**
	 * Saves the Given TrainingPool.
	 * 
	 * @param resource
	 *            TrainingPool to Save.
	 * @return Saved TrainingPool
	 */
	public Resource save(TrainingPool resource) {
		this.logger.trace("ResourceService.save()");

		Resource savedResource = null;

		try {
			savedResource = this.poolDao.save(resource);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedResource;
	}

	/**
	 * Saves the Given Classroom.
	 * 
	 * @param resource
	 *            Classroom to Save.
	 * @return Saved Classroom
	 */
	public Resource save(Classroom resource) {
		this.logger.trace("ResourceService.save()");

		Resource savedResource = null;

		try {
			savedResource = this.classroomDao.save(resource);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedResource;
	}

	/**
	 * Saves the Given Boat.
	 * 
	 * @param resource
	 *            Boat to Save.
	 * @return Saved Boat
	 */
	public Resource save(Boat resource) {
		this.logger.trace("ResourceService.save()");

		Resource savedResource = null;

		try {
			savedResource = this.boatDao.save(resource);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedResource;
	}

	/**
	 * Gets All Resources.
	 * 
	 * @return List of Resources
	 */
	public List<Resource> getAll() {
		this.logger.trace("ResourceService.getAll()");

		return this.resourceDao.getAll();
	}

	/**
	 * Deletes the Specified Resource.
	 * 
	 * @param resourceId
	 *            ID of the Resource to Delete
	 */
	public void delete(Integer resourceId) {
		this.logger.trace("ResourceService.delete()");

		this.resourceDao.delete(resourceId);
	}

	/**
	 * Gets the Specified Resource.
	 * 
	 * @param resourceId
	 *            ID of Resource To Get
	 * @return Retrieved Resource
	 */
	public Resource get(Integer resourceId) {
		this.logger.trace("ResourceService.get()");

		return this.resourceDao.get(resourceId);
	}

}
