package net.bryansaunders.dss.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import net.bryansaunders.dss.dao.CharterDao;
import net.bryansaunders.dss.dao.ServiceDao;
import net.bryansaunders.dss.dao.TrainingDao;
import net.bryansaunders.dss.dao.TravelDao;
import net.bryansaunders.dss.model.Charter;
import net.bryansaunders.dss.model.Service;
import net.bryansaunders.dss.model.Training;
import net.bryansaunders.dss.model.Travel;

import org.jboss.logging.Logger;

/**
 * Service Class for managing Services.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Stateless
public class ServiceService {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(ServiceService.class);

	/**
	 * Charter DAO.
	 */
	@Inject
	private CharterDao charterDao;

	/**
	 * Travel DAO.
	 */
	@Inject
	private TravelDao travelDao;

	/**
	 * Training DAO.
	 */
	@Inject
	private TrainingDao trainingDao;

	/**
	 * Service DAO.
	 */
	@Inject
	private ServiceDao serviceDao;

	/**
	 * Schedule Service
	 */
	@Inject
	private ScheduleService scheduleService;

	/**
	 * EJB Context for Transaction Rollback.
	 */
	@Resource
	private EJBContext context;

	/**
	 * Saves the Given Training.
	 * 
	 * @param service
	 *            Training to Save.
	 * @return Saved Training
	 */
	public Service save(Training service) {
		this.logger.trace("ServiceService.save()");

		Service savedResource = null;

		try {
			savedResource = this.trainingDao.save(service);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedResource;
	}

	/**
	 * Saves the Given Charter.
	 * 
	 * @param service
	 *            Charter to Save.
	 * @return Saved Charter
	 */
	public Service save(Charter service) {
		this.logger.trace("ServiceService.save()");

		Service savedResource = null;

		try {
			savedResource = this.charterDao.save(service);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedResource;
	}

	/**
	 * Saves the Given Travel.
	 * 
	 * @param service
	 *            Travel to Save.
	 * @return Saved Travel
	 */
	public Service save(Travel service) {
		this.logger.trace("ServiceService.save()");

		Service savedResource = null;

		try {
			savedResource = this.travelDao.save(service);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedResource;
	}

	/**
	 * Gets All Services.
	 * 
	 * @return List of Services
	 */
	public List<Service> getAll() {
		this.logger.trace("ServiceService.getAll()");

		return this.serviceDao.getAll();
	}

	/**
	 * Deletes the Specified Service.
	 * 
	 * @param serviceId
	 *            ID of the Service to Delete
	 */
	public void delete(Integer serviceId) {
		this.logger.trace("ServiceService.delete()");

		this.serviceDao.delete(serviceId);
	}

	/**
	 * Gets the Specified Service.
	 * 
	 * @param serviceId
	 *            ID of Service To Get
	 * @return Retrieved Service
	 */
	public Service get(Integer serviceId) {
		this.logger.trace("ServiceService.get()");

		return this.serviceDao.get(serviceId);
	}

	/**
	 * Schedules Training.
	 * 
	 * @param training
	 *            Training to Schedule
	 * @return Scheduled Training
	 */
	public Service schedule(Training training) {
		// TODO Schedule Training
		return this.save(training);
	}

	/**
	 * Schedules Charter.
	 * 
	 * @param charter
	 *            Charter to Schedule
	 * @return Scheduled Charter
	 */
	public Service schedule(Charter charter) {
		// TODO Schedule Charter
		return this.save(charter);
	}

	/**
	 * Schedules Travel.
	 * 
	 * @param travel
	 *            Travel to Schedule
	 * @return Scheduled Travel
	 */
	public Service schedule(Travel travel) {
		travel = this.scheduleService.scheduleTravel(travel);
		return this.save(travel);
	}

}
