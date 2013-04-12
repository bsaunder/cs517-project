/**
 * 
 */
package net.bryansaunders.dss.service.rest;

import java.util.List;

import javax.ejb.EJBException;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.bryansaunders.dss.model.Staff;
import net.bryansaunders.dss.service.StaffService;

import org.jboss.logging.Logger;

/**
 * Staff REST API.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Path("/staff")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class StaffApi {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(StaffApi.class);

	/**
	 * Staff Service
	 */
	@Inject
	private StaffService staffService;

	/**
	 * Adds Staff.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Staff Creation.</li>
	 * <li>Status 400: Error Adding Staff.</li>
	 * </ul>
	 * 
	 * @param staff
	 *            Staff to Add
	 * @return Saved Staff
	 */
	@POST
	@Path("add")
	public Response addStaff(final Staff staff) {
		this.logger.trace("StaffApi.addStaff()");

		Response response;

		try {
			Staff savedStaff = this.staffService.save(staff);
			response = Response.ok(savedStaff).status(Response.Status.CREATED)
					.build();
		} catch (final EJBException e) {
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity("JSON Invalid: " + e.getMessage()).build();
		}

		return response;
	}

	/**
	 * Edit Staff.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Staff Update.</li>
	 * <li>Status 400: Error Updating Staff.</li>
	 * </ul>
	 * 
	 * @param staff
	 *            Staff to Edit
	 * @return Updated Staff
	 */
	@PUT
	@Path("update")
	public Response updateStaff(final Staff staff) {
		this.logger.trace("StaffApi.updateStaff()");

		Response response;

		try {
			Staff updatedStaff = this.staffService.save(staff);
			response = Response.ok(updatedStaff).status(Response.Status.OK)
					.build();
		} catch (final EJBException e) {
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity("JSON Invalid: " + e.getMessage()).build();
		}

		return response;
	}

	/**
	 * List Staff.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Staff Listing.</li>
	 * <li>Status 400: Error Getting Staff List.</li>
	 * </ul>
	 * 
	 * @return Staff List
	 */
	@GET
	@Path("list")
	public Response listStaff() {
		this.logger.trace("StaffApi.listStaff()");

		Response response;

		List<Staff> staffList = this.staffService.getAll();
		if (staffList != null && !staffList.isEmpty()) {
			response = Response.ok(staffList).status(Response.Status.OK)
					.build();
		} else {
			response = Response.status(Response.Status.NOT_FOUND)
					.entity("No Results Found").build();
		}

		return response;
	}

	/**
	 * Delete Staff.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Staff Deletion.</li>
	 * <li>Status 400: Error Deleting Staff.</li>
	 * </ul>
	 * 
	 * @param staffId
	 *            ID of Staff to Delete
	 * @return Delete Result
	 */
	@DELETE
	@Path("delete")
	public Response deleteStaff(final Integer staffId) {
		this.logger.trace("StaffApi.deleteStaff()");

		Response response;

		// Does this need Error Handling If the ID Is Not Found?
		this.staffService.delete(staffId);
		response = Response.ok().status(Response.Status.OK).build();

		return response;
	}

	/**
	 * Get Staff.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Staff Get.</li>
	 * <li>Status 400: Error Getting Staff.</li>
	 * </ul>
	 * 
	 * @param staffId
	 *            ID of Staff to Get
	 * @return Staff
	 */
	@GET
	@Path("get")
	public Response getStaff(final Integer staffId) {
		this.logger.trace("StaffApi.getStaff()");

		Response response;

		Staff staff = this.staffService.get(staffId);
		if (staff != null) {
			response = Response.ok(staff).status(Response.Status.OK).build();
		} else {
			response = Response.status(Response.Status.NOT_FOUND)
					.entity("No Results Found").build();
		}

		return response;
	}

}
