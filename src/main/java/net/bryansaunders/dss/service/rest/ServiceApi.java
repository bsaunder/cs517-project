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

import net.bryansaunders.dss.model.Charter;
import net.bryansaunders.dss.model.Service;
import net.bryansaunders.dss.model.Training;
import net.bryansaunders.dss.model.Travel;
import net.bryansaunders.dss.service.ServiceService;

import org.jboss.logging.Logger;

/**
 * Service REST API.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Path("/resource")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class ServiceApi {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(StaffApi.class);

	/**
	 * Resource Service
	 */
	@Inject
	private ServiceService serviceService;

	/**
	 * Adds Classroom.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Classroom Creation.</li>
	 * <li>Status 400: Error Adding Classroom.</li>
	 * </ul>
	 * 
	 * @param travel
	 *            Travel to Add.
	 * @return Saved Travel
	 */
	@POST
	@Path("add/travel")
	public Response addTravel(final Travel travel) {
		return this.saveService(travel);
	}

	/**
	 * Updates Classroom.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Classroom Update.</li>
	 * <li>Status 400: Error Updating Classroom.</li>
	 * </ul>
	 * 
	 * @param travel
	 *            Travel to Update.
	 * @return Saved Travel
	 */
	@PUT
	@Path("update/travel")
	public Response updateTravel(final Travel travel) {
		return this.saveService(travel);
	}

	/**
	 * Adds Training.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Training Creation.</li>
	 * <li>Status 400: Error Adding Training.</li>
	 * </ul>
	 * 
	 * @param training
	 *            Training To Add
	 * @return Saved Training
	 */
	@POST
	@Path("add/training")
	public Response addTraining(final Training training) {
		return this.saveService(training);
	}

	/**
	 * Updates Training.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Training Update.</li>
	 * <li>Status 400: Error Updating Training.</li>
	 * </ul>
	 * 
	 * @param training
	 *            Training To Update
	 * @return Saved Training
	 */
	@PUT
	@Path("update/training")
	public Response updateTraining(final Training training) {
		return this.saveService(training);
	}

	/**
	 * Adds Charter.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Charter Creation.</li>
	 * <li>Status 400: Error Adding Charter.</li>
	 * </ul>
	 * 
	 * @param charter
	 *            Charter to Add
	 * @return Saved Charter
	 */
	@POST
	@Path("add/charter")
	public Response addCharter(final Charter charter) {
		return this.saveService(charter);
	}

	/**
	 * Updates Charter.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Charter Update.</li>
	 * <li>Status 400: Error Updating Charter.</li>
	 * </ul>
	 * 
	 * @param charter
	 *            Charter to Update
	 * @return Saved Charter
	 */
	@PUT
	@Path("update/charter")
	public Response updateCharter(final Charter charter) {
		return this.saveService(charter);
	}

	/**
	 * Saves Service.
	 * 
	 * @param resource
	 *            Service to Save
	 * @return Saved Service
	 */
	private Response saveService(final Service resource) {
		this.logger.trace("ServiceApi.saveService()");

		Response response;

		Service savedService = this.serviceService.save(resource);
		response = Response.ok(savedService).status(Response.Status.CREATED)
				.build();

		return response;
	}

	/**
	 * List Services.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Service Listing.</li>
	 * <li>Status 400: Error Getting Service List.</li>
	 * </ul>
	 * 
	 * @return Service List
	 */
	@GET
	@Path("list")
	public Response listService() {
		this.logger.trace("ServiceApi.listService()");

		Response response;

		List<Service> serviceList = this.serviceService.getAll();
		if (serviceList != null && !serviceList.isEmpty()) {
			response = Response.ok(serviceList).status(Response.Status.OK)
					.build();
		} else {
			response = Response.status(Response.Status.NOT_FOUND)
					.entity("No Results Found").build();
		}

		return response;
	}

	/**
	 * Delete Service.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Service Deletion.</li>
	 * <li>Status 400: Error Deleting Service.</li>
	 * </ul>
	 * 
	 * @param serviceId
	 *            ID of Service to Delete
	 * @return Delete Result
	 */
	@DELETE
	@Path("delete/{id}")
	public Response deleteService(@PathParam("id") final Integer serviceId) {
		this.logger.trace("ServiceApi.deleteService()");

		Response response;

		this.serviceService.delete(serviceId);
		response = Response.ok().status(Response.Status.OK).build();

		return response;
	}

	/**
	 * Get Service.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Service Get.</li>
	 * <li>Status 400: Error Getting Service.</li>
	 * </ul>
	 * 
	 * @param serviceId
	 *            ID of Service to Get
	 * @return Service
	 */
	@GET
	@Path("get/{id}")
	public Response getService(@PathParam("id") final Integer serviceId) {
		this.logger.trace("ServiceApi.getService()");

		Response response;

		Service service = this.serviceService.get(serviceId);
		response = Response.ok(service).status(Response.Status.OK).build();

		return response;
	}

	/**
	 * Creates a Test ShopKeeper.
	 */
	// TODO Remove Test Method
	@GET
	@Path("create")
	public Response createTest() {
		this.logger.trace("ServiceApi.createTest()");

		Response response;

		this.serviceService.createTest();
		response = Response.ok().status(Response.Status.OK).build();

		return response;
	}
}