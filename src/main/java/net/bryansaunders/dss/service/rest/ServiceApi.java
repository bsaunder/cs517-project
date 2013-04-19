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
@Path("/service")
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
		this.logger.trace("ServiceApi.saveService()");

		Response response;

		Service savedService = this.serviceService.schedule(travel);
		response = Response.ok(savedService).status(Response.Status.CREATED)
				.build();

		return response;
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
		this.logger.trace("ServiceApi.updateTravel()");

		Response response;

		Service savedService = this.serviceService.save(travel);
		response = Response.ok(savedService).status(Response.Status.CREATED)
				.build();

		return response;
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
		this.logger.trace("ServiceApi.addTraining()");

		Response response;

		Service savedService = this.serviceService.schedule(training);
		response = Response.ok(savedService).status(Response.Status.CREATED)
				.build();

		return response;
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
		this.logger.trace("ServiceApi.updateTraining()");

		Response response;

		Service savedService = this.serviceService.save(training);
		response = Response.ok(savedService).status(Response.Status.CREATED)
				.build();

		return response;
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
		this.logger.trace("ServiceApi.addCharter()");

		Response response;

		Service savedService = this.serviceService.schedule(charter);
		response = Response.ok(savedService).status(Response.Status.CREATED)
				.build();

		return response;
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
		this.logger.trace("ServiceApi.updateCharter()");

		Response response;

		Service savedService = this.serviceService.save(charter);
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
}