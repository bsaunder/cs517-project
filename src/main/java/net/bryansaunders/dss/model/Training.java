/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	 * Course Instructors.
	 */
	@Size(min = 1)
	@OneToMany
	private List<Staff> staff = new LinkedList<Staff>();

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
	 * @param courseNumber
	 *            the courseNumber to set
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
	 * @param courseName
	 *            the courseName to set
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
	 * @param type
	 *            the type to set
	 */
	public void setType(TrainingType type) {
		this.type = type;
	}

	/**
	 * Get the staff.
	 * 
	 * @return the staff
	 */
	public List<Staff> getStaff() {
		return this.staff;
	}

	/**
	 * Set the staff.
	 * 
	 * @param staff
	 *            the staff to set
	 */
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

}
