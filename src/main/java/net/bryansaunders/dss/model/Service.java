package net.bryansaunders.dss.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

import net.bryansaunders.dss.model.embeddable.Address;

/**
 * Service Superclass.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Service extends BaseEntity {

	/**
	 * Service Name.
	 */
	@NotNull
	private String name;

	/**
	 * Maximum Number of Customers.
	 */
	@NotNull
	private Integer maxCustomers;

	/**
	 * Service Start Date.
	 */
	@NotNull
	private Date startDate;

	/**
	 * Service End Date.
	 */
	@NotNull
	private Date endDate;

	/**
	 * Cost.
	 */
	@NotNull
	private Integer cost;

	/**
	 * Description.
	 */
	private String description;

	/**
	 * Location of Service.
	 */
	@NotNull
	private Address address;

	/**
	 * Get the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the name.
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the maxCustomers.
	 * 
	 * @return the maxCustomers
	 */
	public Integer getMaxCustomers() {
		return this.maxCustomers;
	}

	/**
	 * Set the maxCustomers.
	 * 
	 * @param maxCustomers
	 *            the maxCustomers to set
	 */
	public void setMaxCustomers(Integer maxCustomers) {
		this.maxCustomers = maxCustomers;
	}

	/**
	 * Get the startDate.
	 * 
	 * @return the startDate
	 */
	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * Set the startDate.
	 * 
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Get the endDate.
	 * 
	 * @return the endDate
	 */
	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * Set the endDate.
	 * 
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Get the cost.
	 * 
	 * @return the cost
	 */
	public Integer getCost() {
		return this.cost;
	}

	/**
	 * Set the cost.
	 * 
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(Integer cost) {
		this.cost = cost;
	}

	/**
	 * Get the description.
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the description.
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the address.
	 * 
	 * @return the address
	 */
	public Address getAddress() {
		return this.address;
	}

	/**
	 * Set the address.
	 * 
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
