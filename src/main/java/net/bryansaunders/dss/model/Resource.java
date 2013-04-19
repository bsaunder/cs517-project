package net.bryansaunders.dss.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

import net.bryansaunders.dss.model.embeddable.Address;

/**
 * Resource Superclass.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Resource extends BaseEntity {

	/**
	 * Resource Name.
	 */
	@NotNull
	private String name;

	/**
	 * Resource Address.
	 */
	@NotNull
	@Embedded
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
