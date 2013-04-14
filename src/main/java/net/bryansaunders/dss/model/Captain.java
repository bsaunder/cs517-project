/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Captain Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Table(name = "captain")
@XmlRootElement
public class Captain extends InsuredStaff {

}
