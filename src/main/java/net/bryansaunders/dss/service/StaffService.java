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

import net.bryansaunders.dss.dao.CaptainDao;
import net.bryansaunders.dss.dao.DiveMasterDao;
import net.bryansaunders.dss.dao.InstructorDao;
import net.bryansaunders.dss.dao.ShopKeeperDao;
import net.bryansaunders.dss.dao.StaffDao;
import net.bryansaunders.dss.dao.TechnicianDao;
import net.bryansaunders.dss.model.Captain;
import net.bryansaunders.dss.model.DiveMaster;
import net.bryansaunders.dss.model.Instructor;
import net.bryansaunders.dss.model.ShopKeeper;
import net.bryansaunders.dss.model.Staff;
import net.bryansaunders.dss.model.Technician;

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
	 * Captain DAO.
	 */
	@Inject
	private CaptainDao captainDao;

	/**
	 * Instructor DAO.
	 */
	@Inject
	private InstructorDao instructorDao;

	/**
	 * DiveMaster DAO.
	 */
	@Inject
	private DiveMasterDao divemasterDao;

	/**
	 * ShopKeeper DAO.
	 */
	@Inject
	private ShopKeeperDao shopkeeperDao;

	/**
	 * Technician DAO.
	 */
	@Inject
	private TechnicianDao technicianDao;

	/**
	 * Generic Staff DAO.
	 */
	@Inject
	private StaffDao staffDao;

	/**
	 * EJB Context for Transaction Rollback.
	 */
	@Resource
	private EJBContext context;

	/**
	 * Saves the Given Technician.
	 * 
	 * @param staff
	 *            Technician to Save.
	 * @return Saved Technician
	 */
	public Staff save(Technician staff) {
		this.logger.trace("StaffService.save()");

		Staff savedStaff = null;

		try {
			savedStaff = this.technicianDao.save(staff);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedStaff;
	}

	/**
	 * Saves the Given DiveMaster.
	 * 
	 * @param staff
	 *            DiveMaster to Save.
	 * @return Saved DiveMaster
	 */
	public Staff save(DiveMaster staff) {
		this.logger.trace("StaffService.save()");

		Staff savedStaff = null;

		try {
			savedStaff = this.divemasterDao.save(staff);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedStaff;
	}

	/**
	 * Saves the Given Captain.
	 * 
	 * @param staff
	 *            Captain to Save.
	 * @return Saved Captain
	 */
	public Staff save(Captain staff) {
		this.logger.trace("StaffService.save()");

		Staff savedStaff = null;

		try {
			savedStaff = this.captainDao.save(staff);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedStaff;
	}

	/**
	 * Saves the Given ShopKeeper.
	 * 
	 * @param staff
	 *            ShopKeeper to Save.
	 * @return Saved ShopKeeper
	 */
	public Staff save(ShopKeeper staff) {
		this.logger.trace("StaffService.save()");

		Staff savedStaff = null;

		try {
			savedStaff = this.shopkeeperDao.save(staff);
		} catch (ConstraintViolationException e) {
			this.context.setRollbackOnly();
			throw e;
		}

		return savedStaff;
	}

	/**
	 * Saves the Given Instructor.
	 * 
	 * @param staff
	 *            Instructor to Save.
	 * @return Saved Instructor
	 */
	public Staff save(Instructor staff) {
		this.logger.trace("StaffService.save()");

		Staff savedStaff = null;

		try {
			savedStaff = this.instructorDao.save(staff);
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

		return this.staffDao.get(staffId);
	}

	/**
	 * Gets all Staff.
	 * 
	 * @return Staff List
	 */
	public List<Staff> getAll() {
		this.logger.trace("StaffService.getAll()");

		return this.staffDao.getAll();
	}

	/**
	 * Deletes the Staff with the Given ID.
	 * 
	 * @param staffId
	 *            ID of Staff to Delete.
	 */
	public void delete(Integer staffId) {
		this.logger.trace("StaffService.delete()");

		this.staffDao.delete(staffId);
	}
}
