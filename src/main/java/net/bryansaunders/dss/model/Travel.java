/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

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

}
