/**
 * 
 */
package net.bryansaunders.dss.model.embeddable;

import javax.validation.constraints.NotNull;

import net.bryansaunders.dss.model.constraint.ZipCode;

/**
 * Address Data Object.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class Address {

	/**
	 * Address Line 1.
	 */
	@NotNull
	private String line1;

	/**
	 * Address Line 2.
	 */
	private String line2;

	/**
	 * City.
	 */
	@NotNull
	private String city;

	/**
	 * State.
	 */
	@NotNull
	private String state;

	/**
	 * Zip Code.
	 */
	@ZipCode
	private String zip;

	/**
	 * Get the line1.
	 * 
	 * @return the line1
	 */
	public String getLine1() {
		return this.line1;
	}

	/**
	 * Set the line1.
	 * 
	 * @param line1
	 *            the line1 to set
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * Get the line2.
	 * 
	 * @return the line2
	 */
	public String getLine2() {
		return this.line2;
	}

	/**
	 * Set the line2.
	 * 
	 * @param line2
	 *            the line2 to set
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/**
	 * Get the city.
	 * 
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Set the city.
	 * 
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Get the state.
	 * 
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Set the state.
	 * 
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Get the zip.
	 * 
	 * @return the zip
	 */
	public String getZip() {
		return this.zip;
	}

	/**
	 * Set the zip.
	 * 
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

}
