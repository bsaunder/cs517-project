/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Training Pool Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class TrainingPool extends Resource {

	/**
	 * Max Pool Depth.
	 */
	@NotNull
	private Integer maxDepth;

	/**
	 * Max Pool Occupants.
	 */
	@NotNull
	private Integer maxOccupants;

	/**
	 * Get the maxDepth.
	 * 
	 * @return the maxDepth
	 */
	public Integer getMaxDepth() {
		return this.maxDepth;
	}

	/**
	 * Set the maxDepth.
	 * 
	 * @param maxDepth
	 *            the maxDepth to set
	 */
	public void setMaxDepth(Integer maxDepth) {
		this.maxDepth = maxDepth;
	}

	/**
	 * Get the maxOccupants.
	 * 
	 * @return the maxOccupants
	 */
	public Integer getMaxOccupants() {
		return this.maxOccupants;
	}

	/**
	 * Set the maxOccupants.
	 * 
	 * @param maxOccupants
	 *            the maxOccupants to set
	 */
	public void setMaxOccupants(Integer maxOccupants) {
		this.maxOccupants = maxOccupants;
	}

}
