package net.bryansaunders.dss.dao;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.bryansaunders.dss.model.DiveMaster;

/**
 * Dive Master Dao.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class DiveMasterDao extends GenericDaoImpl<DiveMaster> {

	/**
	 * Get Available DiveMasters
	 * 
	 * @param start
	 *            Start Date.
	 * @param end
	 *            End Date.
	 * @return List of DiveMasters.
	 */
	public List<DiveMaster> getAvailable(Date start, Date end) {
		// TODO Implement Logic
		return Collections.emptyList();
	}
}
