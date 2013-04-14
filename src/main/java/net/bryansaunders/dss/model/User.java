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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import net.bryansaunders.dss.model.enumerator.Permission;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Length;

/**
 * User Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Table(name = "user")
@XmlRootElement
public class User extends BaseEntity {

	/**
	 * Username.
	 */
	@NotNull
	private String username;

	/**
	 * Password (Plain Text).
	 */
	@NotNull
	@Length(min = 3)
	// TODO Convert to Password Hash
	private String password;

	/**
	 * User Permissions.
	 */
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@Enumerated(EnumType.STRING)
	@CollectionTable(name = "permission", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
	@Column(name = "permission")
	List<Permission> permissions = new LinkedList<Permission>();

	/**
	 * Staff Member that the Account Belongs To.
	 */
	@NotNull
	@OneToOne
	private Staff staffMember;

	/**
	 * Get the username.
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Set the username.
	 * 
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Get the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Set the password.
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Get the staffMember.
	 * 
	 * @return the staffMember
	 */
	public Staff getStaffMember() {
		return this.staffMember;
	}

	/**
	 * Set the staffMember.
	 * 
	 * @param staffMember
	 *            the staffMember to set
	 */
	public void setStaffMember(Staff staffMember) {
		this.staffMember = staffMember;
	}

}
