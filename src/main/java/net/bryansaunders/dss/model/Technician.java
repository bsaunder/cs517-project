/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Shop Technician Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Table(name = "technician")
@XmlRootElement
public class Technician extends CertifiedStaff {

}
