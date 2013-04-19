package net.bryansaunders.dss.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import net.bryansaunders.dss.dao.ServiceDao;
import net.bryansaunders.dss.model.Service;
import net.bryansaunders.dss.model.Travel;
import net.bryansaunders.dss.model.embeddable.Address;

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
	private final Logger logger = Logger.getLogger(StaffService.class);

	/**
	 * Staff DAO.
	 */
	@Inject
	private ServiceDao dao;

	/**
	 * EJB Context for Transaction Rollback.
	 */
	@Resource
	private EJBContext context;

	/**
	 * Saves the Given Service.
	 * 
	 * @param service
	 *            Service to Save.
	 * @return Saved Service
	 */
	public Service save(Service service) {
		this.logger.trace("ServiceService.save()");

		Service savedResource = null;

		try {
			savedResource = this.dao.save(service);
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

		return this.dao.getAll();
	}

	/**
	 * Deletes the Specified Service.
	 * 
	 * @param serviceId
	 *            ID of the Service to Delete
	 */
	public void delete(Integer serviceId) {
		this.logger.trace("ServiceService.delete()");

		this.dao.delete(serviceId);
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

		return this.dao.get(serviceId);
	}

	/**
	 * Creates a Test Travel.
	 */
	// TODO Remove Test Method
	public void createTest() {
		Travel travel = new Travel();
		travel.setCost(5000);
		travel.setDescription("Fun Travel!");
		travel.setDestinationDesc("Tropical Island");
		travel.setDestinationName("Little Cayman");
		travel.setEndDate(new Date());
		travel.setStartDate(new Date());
		travel.setMaxCustomers(10);
		travel.setName("Test Travel");
		
		Address address = new Address();
		address.setCity("Charleston");
		address.setState("SC");
		address.setLine1("123 Main Street");
		address.setLine2("Unit 5");
		address.setZip("12345");
		travel.setAddress(address);
		
		this.dao.save(travel);

	}

}
