/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import net.bryansaunders.dss.model.enumerator.TrainingType;

/**
 * Training Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class Training extends Service {

	/**
	 * Course Number.
	 */
	@NotNull
	private Integer courseNumber;

	/**
	 * Course Name.
	 */
	@NotNull
	private String courseName;

	/**
	 * Training Type.
	 */
	@NotNull
	private TrainingType type;

	/**
	 * Get the courseNumber.
	 * 
	 * @return the courseNumber
	 */
	public Integer getCourseNumber() {
		return this.courseNumber;
	}

	/**
	 * Set the courseNumber.
	 * 
	 * @param courseNumber the courseNumber to set
	 */
	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}

	/**
	 * Get the courseName.
	 * 
	 * @return the courseName
	 */
	public String getCourseName() {
		return this.courseName;
	}

	/**
	 * Set the courseName.
	 * 
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * Get the type.
	 * 
	 * @return the type
	 */
	public TrainingType getType() {
		return this.type;
	}

	/**
	 * Set the type.
	 * 
	 * @param type the type to set
	 */
	public void setType(TrainingType type) {
		this.type = type;
	}
}
