package net.bryansaunders.dss.dao;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.bryansaunders.dss.model.Captain;

/**
 * Captain Dao.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class CaptainDao extends GenericDaoImpl<Captain> {

	/**
	 * Get Available Captains
	 * 
	 * @param start
	 *            Start Date.
	 * @param end
	 *            End Date.
	 * @return List of Captains.
	 */
	public List<Captain> getAvailable(Date start, Date end) {
		// TODO Implement Logic
		return Collections.emptyList();
	}
}
