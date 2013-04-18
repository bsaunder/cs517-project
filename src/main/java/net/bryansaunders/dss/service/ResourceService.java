package net.bryansaunders.dss.service;

import java.util.List;

import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import net.bryansaunders.dss.dao.ResourceDao;
import net.bryansaunders.dss.model.Classroom;
import net.bryansaunders.dss.model.Resource;
import net.bryansaunders.dss.model.embeddable.Address;

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
	private final Logger logger = Logger.getLogger(StaffService.class);

	/**
	 * Staff DAO.
	 */
	@Inject
	private ResourceDao dao;

	/**
	 * EJB Context for Transaction Rollback.
	 */
	@javax.annotation.Resource
	private EJBContext context;

	/**
	 * Saves the Given Resource.
	 * 
	 * @param resource
	 *            Resource to Save.
	 * @return Saved Resource
	 */
	public Resource save(Resource resource) {
		this.logger.trace("ResourceService.save()");

		Resource savedResource = null;

		try {
			savedResource = this.dao.save(resource);
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

		return this.dao.getAll();
	}

	/**
	 * Deletes the Specified Resource.
	 * 
	 * @param resourceId
	 *            ID of the Resource to Delete
	 */
	public void delete(Integer resourceId) {
		this.logger.trace("ResourceService.delete()");

		this.dao.delete(resourceId);
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

		return this.dao.get(resourceId);
	}
	
	/**
	 * Creates a Test ShopKeeper.
	 */
	// TODO Remove Test Method
	public void createTest() {
		Classroom classroom = new Classroom();
		classroom.setName("Class One");
		classroom.setMaxStudents(10);
		
		Address address = new Address();
		address.setCity("Charleston");
		address.setState("SC");
		address.setLine1("123 Main Street");
		address.setLine2("Unit 5");
		address.setZip("12345");
		classroom.setAddress(address);
		
		this.dao.save(classroom);
	}

}
