package net.bryansaunders.dss.dao;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.bryansaunders.dss.model.ShopKeeper;

/**
 * Shop Keeper Dao.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
public class ShopKeeperDao extends GenericDaoImpl<ShopKeeper> {

	/**
	 * Get Available ShopKeepers
	 * 
	 * @param start
	 *            Start Date.
	 * @param end
	 *            End Date.
	 * @return List of ShopKeepers.
	 */
	public List<ShopKeeper> getAvailable(Date start, Date end) {
		// TODO Implement Logic
		return Collections.emptyList();
	}
}
