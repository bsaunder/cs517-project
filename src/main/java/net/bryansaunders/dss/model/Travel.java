/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Travel Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class Travel extends Service {

	/**
	 * Destination Name.
	 */
	@NotNull
	private String destinationName;

	/**
	 * Travel Guides.
	 */
	@Size(min = 1)
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Instructor> instructors = new HashSet<Instructor>();

	/**
	 * Destination Description.
	 */
	private String destinationDesc;

	/**
	 * Get the destinationName.
	 * 
	 * @return the destinationName
	 */
	public String getDestinationName() {
		return this.destinationName;
	}

	/**
	 * Set the destinationName.
	 * 
	 * @param destinationName
	 *            the destinationName to set
	 */
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	/**
	 * Get the destinationDesc.
	 * 
	 * @return the destinationDesc
	 */
	public String getDestinationDesc() {
		return this.destinationDesc;
	}

	/**
	 * Set the destinationDesc.
	 * 
	 * @param destinationDesc
	 *            the destinationDesc to set
	 */
	public void setDestinationDesc(String destinationDesc) {
		this.destinationDesc = destinationDesc;
	}

	/**
	 * Get the instructors.
	 * 
	 * @return the instructors
	 */
	public Set<Instructor> getInstructors() {
		return this.instructors;
	}

	/**
	 * Set the instructors.
	 * 
	 * @param instructors
	 *            the instructors to set
	 */
	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}

}
