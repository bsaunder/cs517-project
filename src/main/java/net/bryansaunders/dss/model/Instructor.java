/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Instructor Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Entity
@Table(name = "instructor")
@XmlRootElement
public class Instructor extends InsuredStaff {

}
