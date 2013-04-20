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
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

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
	 * Charter Captain.
	 */
	@NotNull
	@OneToOne
	private Captain captain;

	/**
	 * Charter Instructor.
	 */
	@NotNull
	@OneToOne
	private Instructor instructor;

	/**
	 * Charter DiveMaster.
	 */
	@NotNull
	@OneToOne
	private DiveMaster diveMaster;

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

	/**
	 * Get the captain.
	 * 
	 * @return the captain
	 */
	public Captain getCaptain() {
		return this.captain;
	}

	/**
	 * Set the captain.
	 * 
	 * @param captain
	 *            the captain to set
	 */
	public void setCaptain(Captain captain) {
		this.captain = captain;
	}

	/**
	 * Get the instructor.
	 * 
	 * @return the instructor
	 */
	public Instructor getInstructor() {
		return this.instructor;
	}

	/**
	 * Set the instructor.
	 * 
	 * @param instructor
	 *            the instructor to set
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	/**
	 * Get the diveMaster.
	 * 
	 * @return the diveMaster
	 */
	public DiveMaster getDiveMaster() {
		return this.diveMaster;
	}

	/**
	 * Set the diveMaster.
	 * 
	 * @param diveMaster
	 *            the diveMaster to set
	 */
	public void setDiveMaster(DiveMaster diveMaster) {
		this.diveMaster = diveMaster;
	}

}
