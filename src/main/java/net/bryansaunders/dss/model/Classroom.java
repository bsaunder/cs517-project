/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Classroom Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class Classroom extends Resource {

	/**
	 * Max Students.
	 */
	@NotNull
	private Integer maxStudents;

	/**
	 * Get the maxStudents.
	 * 
	 * @return the maxStudents
	 */
	public Integer getMaxStudents() {
		return this.maxStudents;
	}

	/**
	 * Set the maxStudents.
	 * 
	 * @param maxStudents
	 *            the maxStudents to set
	 */
	public void setMaxStudents(Integer maxStudents) {
		this.maxStudents = maxStudents;
	}

}
