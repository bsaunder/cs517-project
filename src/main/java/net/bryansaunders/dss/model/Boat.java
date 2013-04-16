/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Boat Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class Boat extends Resource {

	/**
	 * Max Passengers.
	 */
	@NotNull
	private Integer maxPassengers;

	/**
	 * Max Crew.
	 */
	@NotNull
	private Integer maxCrew;

	/**
	 * Boat Hull Number.
	 */
	@NotNull
	private String hullNumber;

	/**
	 * Get the maxPassengers.
	 * 
	 * @return the maxPassengers
	 */
	public Integer getMaxPassengers() {
		return this.maxPassengers;
	}

	/**
	 * Set the maxPassengers.
	 * 
	 * @param maxPassengers
	 *            the maxPassengers to set
	 */
	public void setMaxPassengers(Integer maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	/**
	 * Get the maxCrew.
	 * 
	 * @return the maxCrew
	 */
	public Integer getMaxCrew() {
		return this.maxCrew;
	}

	/**
	 * Set the maxCrew.
	 * 
	 * @param maxCrew
	 *            the maxCrew to set
	 */
	public void setMaxCrew(Integer maxCrew) {
		this.maxCrew = maxCrew;
	}

	/**
	 * Get the hullNumber.
	 * 
	 * @return the hullNumber
	 */
	public String getHullNumber() {
		return this.hullNumber;
	}

	/**
	 * Set the hullNumber.
	 * 
	 * @param hullNumber
	 *            the hullNumber to set
	 */
	public void setHullNumber(String hullNumber) {
		this.hullNumber = hullNumber;
	}

}
