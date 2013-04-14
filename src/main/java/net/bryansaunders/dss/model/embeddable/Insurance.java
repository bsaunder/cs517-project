/**
 * 
 */
package net.bryansaunders.dss.model.embeddable;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import net.bryansaunders.dss.model.enumerator.InsuranceType;

/**
 * Insurance Data Object.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Embeddable
public class Insurance {

	/**
	 * Insurance Name.
	 */
	@NotNull
	private String name;

	/**
	 * Insurance Agency.
	 */
	@NotNull
	private String agency;

	/**
	 * Expiration Date.
	 */
	@NotNull
	private Date expDate;

	/**
	 * Insurance Type.
	 */
	@NotNull
	private InsuranceType type;

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
	 * Get the agency.
	 * 
	 * @return the agency
	 */
	public String getAgency() {
		return this.agency;
	}

	/**
	 * Set the agency.
	 * 
	 * @param agency
	 *            the agency to set
	 */
	public void setAgency(String agency) {
		this.agency = agency;
	}

	/**
	 * Get the expDate.
	 * 
	 * @return the expDate
	 */
	public Date getExpDate() {
		return this.expDate;
	}

	/**
	 * Set the expDate.
	 * 
	 * @param expDate
	 *            the expDate to set
	 */
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	/**
	 * Get the type.
	 * 
	 * @return the type
	 */
	public InsuranceType getType() {
		return this.type;
	}

	/**
	 * Set the type.
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(InsuranceType type) {
		this.type = type;
	}

}
