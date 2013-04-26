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
import net.bryansaunders.dss.model.Charter;
import net.bryansaunders.dss.model.Instructor;
import net.bryansaunders.dss.model.Training;
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
		Set<Instructor> instructors = travel.getInstructors();
		if (instructors == null || instructors.isEmpty()) {
			List<Instructor> instructorList = this.instructorDao.getAvailable(travel.getStartDate(),
					travel.getEndDate());
			if (!instructorList.isEmpty()) {
				instructorSet.add(instructorList.get(0));
			}

			// Assign Instructor
			travel.setInstructors(instructorSet);
		}

		// Return Travel
		return travel;
	}

	/**
	 * Schedules the Given Charter.
	 * 
	 * @param charter
	 *            Charter to Schedule.
	 * @return Scheduled Charter.
	 */
	public Charter scheduleCharter(final Charter charter) {
		// TODO Implement Schedule Logic
		return charter;
	}

	/**
	 * Schedules the Given Training.
	 * 
	 * @param training
	 *            Training to Schedule.
	 * @return Scheduled Training.
	 */
	public Training scheduleTraining(final Training training) {
		// TODO Implement Schedule Logic
		return training;
	}
}
