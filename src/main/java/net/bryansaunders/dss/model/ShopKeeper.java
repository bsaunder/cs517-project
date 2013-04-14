/**
 * 
 */
package net.bryansaunders.dss.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Shop Keeper Entity.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 *
 */
@Entity
@Table(name = "shopKeeper")
@XmlRootElement
public class ShopKeeper extends Staff {

}
