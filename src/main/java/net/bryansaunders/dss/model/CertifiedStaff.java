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
import javax.validation.constraints.Size;

import net.bryansaunders.dss.model.embeddable.Certification;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 * Certified Staff Super Class.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
public abstract class CertifiedStaff extends Staff {

	/**
	 * Staff Certifications.
	 */
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(name = "certification", joinColumns = @JoinColumn(name = "staff_id", referencedColumnName = "id"))
	@Size(min = 1)
	List<Certification> certifications = new LinkedList<Certification>();
}
