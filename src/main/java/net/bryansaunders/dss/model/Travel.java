/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.HashSet;
import java.util.Set;

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
	// TODO Has Instructor Constraint
	private Set<Staff> staff = new HashSet<Staff>();

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

}
