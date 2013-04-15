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
import javax.persistence.JoinColumn;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Charter Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public class Charter extends Service {

	/**
	 * Charter Site List.
	 */
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(name = "siteName", joinColumns = @JoinColumn(name = "service_id", referencedColumnName = "id"))
	@Column(name = "siteNames")
	private List<String> siteNames = new LinkedList<String>();

	/**
	 * Get the siteNames.
	 * 
	 * @return the siteNames
	 */
	public List<String> getSiteNames() {
		return this.siteNames;
	}

	/**
	 * Set the siteNames.
	 * 
	 * @param siteNames
	 *            the siteNames to set
	 */
	public void setSiteNames(List<String> siteNames) {
		this.siteNames = siteNames;
	}

}
