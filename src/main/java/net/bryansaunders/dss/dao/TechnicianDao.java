package net.bryansaunders.dss.dao;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.bryansaunders.dss.model.Technician;

/**
 * Technician Dao.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class TechnicianDao extends GenericDaoImpl<Technician> {

	/**
	 * Get Available Technicians
	 * 
	 * @param start
	 *            Start Date.
	 * @param end
	 *            End Date.
	 * @return List of Technicians.
	 */
	public List<Technician> getAvailable(Date start, Date end) {
		// TODO Implement Logic
		return Collections.emptyList();
	}
}
