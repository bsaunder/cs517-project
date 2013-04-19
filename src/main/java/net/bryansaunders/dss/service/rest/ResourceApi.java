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

import net.bryansaunders.dss.model.Boat;
import net.bryansaunders.dss.model.Classroom;
import net.bryansaunders.dss.model.Resource;
import net.bryansaunders.dss.model.TrainingPool;
import net.bryansaunders.dss.service.ResourceService;

import org.jboss.logging.Logger;

/**
 * Resource REST API.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class ResourceApi {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(StaffApi.class);

	/**
	 * Resource Service
	 */
	@Inject
	private ResourceService resourceService;

	/**
	 * Adds Classroom.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Classroom Creation.</li>
	 * <li>Status 400: Error Adding Classroom.</li>
	 * </ul>
	 * 
	 * @param classroom
	 *            Classroom to Add
	 * @return Saved Classroom
	 */
	@POST
	@Path("add/classroom")
	public Response addClassroom(final Classroom classroom) {
		return this.saveResource(classroom);
	}

	/**
	 * Adds TrainingPool.
	 * 
	 * <ul>
	 * <li>Status 200: Successful TrainingPool Creation.</li>
	 * <li>Status 400: Error Adding TrainingPool.</li>
	 * </ul>
	 * 
	 * @param trainingPool
	 *            TrainingPool to Add
	 * @return Saved TrainingPool
	 */
	@POST
	@Path("add/trainingpool")
	public Response addTrainingPool(final TrainingPool trainingPool) {
		return this.saveResource(trainingPool);
	}

	/**
	 * Adds Boat.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Boat Creation.</li>
	 * <li>Status 400: Error Adding Boat.</li>
	 * </ul>
	 * 
	 * @param boat
	 *            Boat to Add
	 * @return Saved Boat
	 */
	@POST
	@Path("add/boat")
	public Response addBoat(final Boat boat) {
		return this.saveResource(boat);
	}

	/**
	 * Updates Boat.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Boat Creation.</li>
	 * <li>Status 400: Error Updateing Boat.</li>
	 * </ul>
	 * 
	 * @param boat
	 *            Boat to Update
	 * @return Saved Boat
	 */
	@PUT
	@Path("update/boat")
	public Response updateBoat(final Boat boat) {
		return this.saveResource(boat);
	}

	/**
	 * Updates Classroom.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Classroom Creation.</li>
	 * <li>Status 400: Error Updateing Classroom.</li>
	 * </ul>
	 * 
	 * @param classroom
	 *            Classroom to Update
	 * @return Saved Classroom
	 */
	@PUT
	@Path("update/classroom")
	public Response updateClassroom(final Classroom classroom) {
		return this.saveResource(classroom);
	}

	/**
	 * Updates TrainingPool.
	 * 
	 * <ul>
	 * <li>Status 200: Successful TrainingPool Creation.</li>
	 * <li>Status 400: Error Updateing TrainingPool.</li>
	 * </ul>
	 * 
	 * @param trainingPool
	 *            TrainingPool to Update
	 * @return Saved TrainingPool
	 */
	@PUT
	@Path("update/trainingpool")
	public Response updateTrainingPool(final TrainingPool trainingPool) {
		return this.saveResource(trainingPool);
	}

	/**
	 * Saves Resource.
	 * 
	 * @param resource
	 *            Resource to Add
	 * @return Saved Resource
	 */
	private Response saveResource(final Resource resource) {
		this.logger.trace("ResourceApi.saveResource()");

		Response response;

		Resource savedResource = this.resourceService.save(resource);
		response = Response.ok(savedResource).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * List Resources.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Resource Listing.</li>
	 * <li>Status 400: Error Getting Resource List.</li>
	 * </ul>
	 * 
	 * @return Resource List
	 */
	@GET
	@Path("list")
	public Response listResource() {
		this.logger.trace("ResourceApi.listResource()");

		Response response;

		List<Resource> resourceList = this.resourceService.getAll();
		if (resourceList != null && !resourceList.isEmpty()) {
			response = Response.ok(resourceList).status(Response.Status.OK)
					.build();
		} else {
			response = Response.status(Response.Status.NOT_FOUND)
					.entity("No Results Found").build();
		}

		return response;
	}

	/**
	 * Delete Resource.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Resource Deletion.</li>
	 * <li>Status 400: Error Deleting Resource.</li>
	 * </ul>
	 * 
	 * @param resourceId
	 *            ID of Resource to Delete
	 * @return Delete Result
	 */
	@DELETE
	@Path("delete/{id}")
	public Response deleteResource(@PathParam("id") final Integer resourceId) {
		this.logger.trace("ResourceApi.deleteResource()");

		Response response;

		this.resourceService.delete(resourceId);
		response = Response.ok().status(Response.Status.OK).build();

		return response;
	}

	/**
	 * Get Resource.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Resource Get.</li>
	 * <li>Status 400: Error Getting Resource.</li>
	 * </ul>
	 * 
	 * @param resourceId
	 *            ID of Resource to Get
	 * @return Resource
	 */
	@GET
	@Path("get/{id}")
	public Response getResource(@PathParam("id") final Integer resourceId) {
		this.logger.trace("ResourceApi.getResource()");

		Response response;

		Resource resource = this.resourceService.get(resourceId);
		response = Response.ok(resource).status(Response.Status.OK).build();

		return response;
	}

	/**
	 * Creates a Test ShopKeeper.
	 */
	// TODO Remove Test Method
	@GET
	@Path("create")
	public Response createTest() {
		this.logger.trace("ResourceApi.createTest()");

		Response response;

		this.resourceService.createTest();
		response = Response.ok().status(Response.Status.OK).build();

		return response;
	}

}
