/**
 * 
 */
package net.bryansaunders.dss.model.embeddable;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * Staff Unavailability Data Object.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Embeddable
public class Unavailability {

	/**
	 * Unavailability Start Date.
	 */
	@NotNull
	private Date startDate;

	/**
	 * Unavailability End Date.
	 */
	@NotNull
	private Date endDate;

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

}
