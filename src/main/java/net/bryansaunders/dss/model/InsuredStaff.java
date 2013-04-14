/**
 * 
 */
package net.bryansaunders.dss.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import net.bryansaunders.dss.model.embeddable.Insurance;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Insured Staff Super Class.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 *
 */
@Entity
public abstract class InsuredStaff extends CertifiedStaff {

	/**
	 * Staff Insurance.
	 */
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(name = "insurance", joinColumns = @JoinColumn(name = "staff_id", referencedColumnName = "id"))
	List<Insurance> insurance = new LinkedList<Insurance>();
}
