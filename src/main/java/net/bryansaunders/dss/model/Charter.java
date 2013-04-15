/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	@OneToMany
	private List<Staff> staff;

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
