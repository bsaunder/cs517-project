/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	@OneToMany(fetch = FetchType.EAGER)
	// TODO Has Instructor Constraint
	private Set<Staff> staff = new HashSet<Staff>();

	/**
	 * Training Pool
	 */
	@OneToOne
	@NotNull
	private TrainingPool pool;

	/**
	 * Classroom
	 */
	@OneToOne
	@NotNull
	private Classroom classRoom;

	/**
	 * Get the classRoom.
	 * 
	 * @return the classRoom
	 */
	public Classroom getClassRoom() {
		return this.classRoom;
	}

	/**
	 * Set the classRoom.
	 * 
	 * @param classRoom
	 *            the classRoom to set
	 */
	public void setClassRoom(Classroom classRoom) {
		this.classRoom = classRoom;
	}

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
	public Set<Staff> getStaff() {
		return this.staff;
	}

	/**
	 * Set the staff.
	 * 
	 * @param staff
	 *            the staff to set
	 */
	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	/**
	 * Get the pool.
	 * 
	 * @return the pool
	 */
	public TrainingPool getPool() {
		return this.pool;
	}

	/**
	 * Set the pool.
	 * 
	 * @param pool
	 *            the pool to set
	 */
	public void setPool(TrainingPool pool) {
		this.pool = pool;
	}

}
