/**
 * 
 */
package net.bryansaunders.dss.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ejb.Stateless;
import javax.inject.Inject;

import net.bryansaunders.dss.dao.InstructorDao;
import net.bryansaunders.dss.model.Instructor;
import net.bryansaunders.dss.model.Travel;

import org.jboss.logging.Logger;

/**
 * Service Class for Scheduling Services.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Stateless
public class ScheduleService {

	/**
	 * Instructor Dao.
	 */
	@Inject
	private InstructorDao instructorDao;

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(ScheduleService.class);

	/**
	 * Schedules the Given Travel.
	 * 
	 * @param travel
	 *            Travel to Schedule.
	 * @return Scheduled Travel.
	 */
	public Travel scheduleTravel(final Travel travel) {
		this.logger.trace("ScheduleService.scheduleTravel()");

		Set<Instructor> instructorSet = new HashSet<Instructor>();

		// Find Instructor
		// TODO Add GetAvailable to DAO and Update
		// TODO If Staff Set, Do Not Change
		List<Instructor> instructorList = this.instructorDao.getAll();
		if (!instructorList.isEmpty()) {
			instructorSet.add(instructorList.get(0));
		}

		// Assign Instructor
		travel.setInstructors(instructorSet);

		// Return Travel
		return travel;
	}
}
