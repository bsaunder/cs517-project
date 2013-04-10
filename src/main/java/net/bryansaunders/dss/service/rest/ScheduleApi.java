package net.bryansaunders.dss.service.rest;

import javax.ejb.EJBException;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Schedule REST API.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Path("/schedule")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class ScheduleApi {

	/**
	 * Schedules a Service.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Schedule Creation.</li>
	 * <li>Status 400: Error Scheduling Service.</li>
	 * </ul>
	 * 
	 * @param serviceId
	 *            ID of Service to Schedule
	 * @return Saved Schedule
	 */
	@POST
	@Path("schedule")
	public Response scheduleService(final Integer serviceId) {
		Response response;

		try {
			// TODO Implement Logic
			response = Response.status(Response.Status.OK).build();
		} catch (final EJBException e) {
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity("JSON Invalid: " + e.getMessage()).build();
		}

		return response;
	}

	/**
	 * List Schedule.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Schedule Listing.</li>
	 * <li>Status 400: Error Getting Schedule List.</li>
	 * </ul>
	 * 
	 * @return Schedule List
	 */
	@GET
	@Path("list")
	public Response listSchedules() {
		Response response;

		try {
			// TODO Implement Logic
			response = Response.status(Response.Status.OK).build();
		} catch (final EJBException e) {
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity("JSON Invalid: " + e.getMessage()).build();
		}

		return response;
	}

	/**
	 * Unschedule Service.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Schedule Deletion.</li>
	 * <li>Status 400: Error Deleting Schedule.</li>
	 * </ul>
	 * 
	 * @param serviceId
	 *            ID of Service to Unschedule
	 * @return Unschedule Result
	 */
	@DELETE
	@Path("unschedule")
	public Response unscheduleService(final Integer serviceId) {
		Response response;

		try {
			// TODO Implement Logic
			response = Response.status(Response.Status.OK).build();
		} catch (final EJBException e) {
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity("JSON Invalid: " + e.getMessage()).build();
		}

		return response;
	}

	/**
	 * Get Schedule.
	 * 
	 * <ul>
	 * <li>Status 200: Successful Schedule Get.</li>
	 * <li>Status 400: Error Getting Schedule.</li>
	 * </ul>
	 * 
	 * @param scheduleId
	 *            Schedule ID to Get
	 * @return Schedule
	 */
	@GET
	@Path("get")
	public Response getSchedule(final Integer scheduleId) {
		Response response;

		try {
			// TODO Implement Logic
			response = Response.status(Response.Status.OK).build();
		} catch (final EJBException e) {
			response = Response.status(Response.Status.BAD_REQUEST)
					.entity("JSON Invalid: " + e.getMessage()).build();
		}
		
		return response;
	}
}
