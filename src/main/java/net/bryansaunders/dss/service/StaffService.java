/**
 * 
 */
package net.bryansaunders.dss.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import net.bryansaunders.dss.dao.StaffDao;
import net.bryansaunders.dss.model.ShopKeeper;
import net.bryansaunders.dss.model.Staff;
import net.bryansaunders.dss.model.embeddable.Address;

import org.jboss.logging.Logger;

/**
 * Service Class for managing Staff.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Stateless
public class StaffService {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(StaffService.class);

	/**
	 * Staff DAO.
	 */
	@Inject
	private StaffDao dao;

	/**
	 * EJB Context for Transaction Rollback.
	 */
	@Resource
	private EJBContext context;

	/**
	 * Saves the Given Staff.
	 * 
	 * @param staff
	 *            Staff to Save.
	 * @return Saved Staff
	 */
	public Staff save(Staff staff) {
		this.logger.trace("StaffService.save()");
		
		Staff savedStaff = null;

		try {
			savedStaff = this.dao.save(staff);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedStaff;
	}

	/**
	 * Get the Staff with the Given ID.
	 * 
	 * @param staffId
	 *            ID of Staff to Get.
	 * @return Staff
	 */
	public Staff get(Integer staffId) {
		this.logger.trace("StaffService.get()");
		
		return this.dao.get(staffId);
	}

	/**
	 * Gets all Staff.
	 * 
	 * @return Staff List
	 */
	public List<Staff> getAll() {
		this.logger.trace("StaffService.getAll()");
		
		return this.dao.getAll();
	}

	/**
	 * Deletes the Staff with the Given ID.
	 * 
	 * @param staffId
	 *            ID of Staff to Delete.
	 */
	public void delete(Integer staffId) {
		this.logger.trace("StaffService.delete()");
		
		this.dao.delete(staffId);
	}
}
