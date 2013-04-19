/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Charter Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class Charter extends Service {

	/**
	 * Charter Site List.
	 */
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(name = "siteName", joinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"))
	@Column(name = "siteNames")
	private List<String> siteNames = new LinkedList<String>();

	/**
	 * Charter Staff.
	 */
	@Size(min = 3, max = 3)
	@OneToMany(fetch = FetchType.EAGER)
	// TODO Has Instructor Constraint
	// TODO Has Captain Constraint
	// TODO Has DiveMaster Constraint
	private Set<Staff> staff = new HashSet<Staff>();

	/**
	 * Charter Boat.
	 */
	@NotNull
	@OneToOne
	private Boat boat;

	/**
	 * Get the siteNames.
	 * 
	 * @return the siteNames
	 */
	public List<String> getSiteNames() {
		return this.siteNames;
	}

	/**
	 * Set the siteNames.
	 * 
	 * @param siteNames
	 *            the siteNames to set
	 */
	public void setSiteNames(List<String> siteNames) {
		this.siteNames = siteNames;
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
	 * Get the boat.
	 * 
	 * @return the boat
	 */
	public Boat getBoat() {
		return this.boat;
	}

	/**
	 * Set the boat.
	 * 
	 * @param boat
	 *            the boat to set
	 */
	public void setBoat(Boat boat) {
		this.boat = boat;
	}

}
