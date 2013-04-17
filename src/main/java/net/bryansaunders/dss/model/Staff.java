package net.bryansaunders.dss.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import net.bryansaunders.dss.model.constraint.PhoneNumber;
import net.bryansaunders.dss.model.embeddable.Address;
import net.bryansaunders.dss.model.embeddable.Unavailability;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Email;

/**
 * Staff Superclass.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Staff extends BaseEntity {

	/**
	 * Name.
	 */
	@NotNull
	private String name;

	/**
	 * Home Phone Number. Must be 10 Digits.
	 */
	@PhoneNumber
	private String homePhone;

	/**
	 * Cell Phone Number. Must be 10 Digits.
	 */
	@NotNull
	@PhoneNumber
	private String cellPhone;

	/**
	 * Email.
	 */
	@NotNull
	@Email
	private String email;

	/**
	 * Mailing Address.
	 */
	@NotNull
	@Embedded
	private Address address;

	/**
	 * Unavailability.
	 */
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(name = "unavailability", joinColumns = @JoinColumn(name = "staff_id", referencedColumnName = "id"))
	List<Unavailability> unavailability = new LinkedList<Unavailability>();

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
	 * Get the homePhone.
	 * 
	 * @return the homePhone
	 */
	public String getHomePhone() {
		return this.homePhone;
	}

	/**
	 * Set the homePhone.
	 * 
	 * @param homePhone
	 *            the homePhone to set
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * Get the cellPhone.
	 * 
	 * @return the cellPhone
	 */
	public String getCellPhone() {
		return this.cellPhone;
	}

	/**
	 * Set the cellPhone.
	 * 
	 * @param cellPhone
	 *            the cellPhone to set
	 */
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	/**
	 * Get the email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the email.
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the unavailability.
	 * 
	 * @return the unavailability
	 */
	public List<Unavailability> getUnavailability() {
		return this.unavailability;
	}

	/**
	 * Set the unavailability.
	 * 
	 * @param unavailability
	 *            the unavailability to set
	 */
	public void setUnavailability(List<Unavailability> unavailability) {
		this.unavailability = unavailability;
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
