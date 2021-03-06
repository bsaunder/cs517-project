/**
 * 
 */
package net.bryansaunders.dss.service.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.bryansaunders.dss.model.Captain;
import net.bryansaunders.dss.model.DiveMaster;
import net.bryansaunders.dss.model.Instructor;
import net.bryansaunders.dss.model.ShopKeeper;
import net.bryansaunders.dss.model.Staff;
import net.bryansaunders.dss.model.Technician;
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
	 * Adds ShopKeeper.
	 * 
	 * <ul>
	 * <li>Status 201: Successful ShopKeeper Creation.</li>
	 * <li>Status 400: Error Adding ShopKeeper.</li>
	 * </ul>
	 * 
	 * @param shopKeeper
	 *            ShopKeeper to Add
	 * @return Saved ShopKeeper
	 */
	@POST
	@Path("add/shopkeeper")
	public Response addShopKeeper(final ShopKeeper shopKeeper) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(shopKeeper);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Adds DiveMaster.
	 * 
	 * <ul>
	 * <li>Status 201: Successful DiveMaster Creation.</li>
	 * <li>Status 400: Error Adding DiveMaster.</li>
	 * </ul>
	 * 
	 * @param diveMaster
	 *            DiveMaster to Add
	 * @return Saved DiveMaster
	 */
	@POST
	@Path("add/diveMaster")
	public Response addDiveMaster(final DiveMaster diveMaster) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(diveMaster);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Adds Instructor.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Instructor Creation.</li>
	 * <li>Status 400: Error Adding Instructor.</li>
	 * </ul>
	 * 
	 * @param instructor
	 *            Instructor to Add
	 * @return Saved Instructor
	 */
	@POST
	@Path("add/instructor")
	public Response addInstructor(final Instructor instructor) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(instructor);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Adds Captain.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Captain Creation.</li>
	 * <li>Status 400: Error Adding Captain.</li>
	 * </ul>
	 * 
	 * @param captain
	 *            Captain to Add
	 * @return Saved Captain
	 */
	@POST
	@Path("add/captain")
	public Response addCaptain(final Captain captain) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(captain);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Adds Technician.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Technician Creation.</li>
	 * <li>Status 400: Error Adding Technician.</li>
	 * </ul>
	 * 
	 * @param tech
	 *            Technician to Add
	 * @return Saved Technician
	 */
	@POST
	@Path("add/technician")
	public Response addTechnician(final Technician tech) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(tech);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Updates ShopKeeper.
	 * 
	 * <ul>
	 * <li>Status 201: Successful ShopKeeper Update.</li>
	 * <li>Status 400: Error Updating ShopKeeper.</li>
	 * </ul>
	 * 
	 * @param shopKeeper
	 *            ShopKeeper to Update
	 * @return Saved ShopKeeper
	 */
	@PUT
	@Path("update/shopkeeper")
	public Response updateShopKeeper(final ShopKeeper shopKeeper) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(shopKeeper);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Updates DiveMaster.
	 * 
	 * <ul>
	 * <li>Status 201: Successful DiveMaster Update.</li>
	 * <li>Status 400: Error Updating DiveMaster.</li>
	 * </ul>
	 * 
	 * @param diveMaster
	 *            DiveMaster to Update
	 * @return Saved DiveMaster
	 */
	@PUT
	@Path("update/diveMaster")
	public Response updateDiveMaster(final DiveMaster diveMaster) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(diveMaster);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Updates Instructor.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Instructor Update.</li>
	 * <li>Status 400: Error Updating Instructor.</li>
	 * </ul>
	 * 
	 * @param instructor
	 *            Instructor to Update
	 * @return Saved Instructor
	 */
	@PUT
	@Path("update/instructor")
	public Response updateInstructor(final Instructor instructor) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(instructor);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Updates Captain.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Captain Update.</li>
	 * <li>Status 400: Error Updating Captain.</li>
	 * </ul>
	 * 
	 * @param captain
	 *            Captain to Update
	 * @return Saved Captain
	 */
	@PUT
	@Path("update/captain")
	public Response updateCaptain(final Captain captain) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(captain);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * Updates Technician.
	 * 
	 * <ul>
	 * <li>Status 201: Successful Technician Update.</li>
	 * <li>Status 400: Error Updating Technician.</li>
	 * </ul>
	 * 
	 * @param tech
	 *            Technician to Update
	 * @return Saved Technician
	 */
	@PUT
	@Path("update/technician")
	public Response updateTechnician(final Technician tech) {
		this.logger.trace("StaffApi.saveStaff()");

		Response response;

		Staff savedStaff = this.staffService.save(tech);
		response = Response.ok(savedStaff).status(Response.Status.CREATED)
				.build();

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
	@Path("delete/{id}")
	public Response deleteStaff(@PathParam("id") final Integer staffId) {
		this.logger.trace("StaffApi.deleteStaff()");

		Response response;

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
	@Path("get/{id}")
	public Response getStaff(@PathParam("id") final Integer staffId) {
		this.logger.trace("StaffApi.getStaff()");

		Response response;

		Staff staff = this.staffService.get(staffId);
		response = Response.ok(staff).status(Response.Status.OK).build();

		return response;
	}

}
