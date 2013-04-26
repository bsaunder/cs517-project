package net.bryansaunders.dss.dao;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.bryansaunders.dss.model.Instructor;

/**
 * Instructor Dao.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class InstructorDao extends GenericDaoImpl<Instructor> {

	/**
	 * Get Available Instructors
	 * 
	 * @param start
	 *            Start Date.
	 * @param end
	 *            End Date.
	 * @return List of Instructors.
	 */
	public List<Instructor> getAvailable(Date start, Date end) {
		// TODO Implement Logic
		return Collections.emptyList();
	}

}
