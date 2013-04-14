/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Dive Master Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 *
 */
@Entity
@Table(name = "diveMaster")
@XmlRootElement
public class DiveMaster extends InsuredStaff {

}
