package net.bryansaunders.dss.service.rest;

import javax.ejb.EJBException;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.bryansaunders.dss.model.Service;

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
     * Adds Service.
     * 
     * <ul>
     * <li>Status 200: Successful Service Creation.</li>
     * <li>Status 400: Error Adding Service.</li>
     * </ul>
     * 
     * @param resource
     *            Service to Add
     * @return Saved Service
     */
    @POST
    @Path("add")
    public Response addService(final Service resource) {
        Response response;

        try {
        	// TODO Implement Logic
        	response = Response.status(Response.Status.OK).build();
        } catch (final EJBException e) {
            response = Response.status(Response.Status.BAD_REQUEST).entity("JSON Invalid: " + e.getMessage()).build();
        }

        return response;
    }
    
    /**
     * Edit Service.
     * 
     * <ul>
     * <li>Status 200: Successful Service Update.</li>
     * <li>Status 400: Error Updating Service.</li>
     * </ul>
     * 
     * @param resource
     *            Service to Edit
     * @return Updated Service
     */
    @PUT
    @Path("update")
    public Response updateService(final Service resource) {
        Response response;

        try {
        	// TODO Implement Logic
        	response = Response.status(Response.Status.OK).build();
        } catch (final EJBException e) {
            response = Response.status(Response.Status.BAD_REQUEST).entity("JSON Invalid: " + e.getMessage()).build();
        }

        return response;
    }
    
    /**
     * List Service.
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
        Response response;

        try {
        	// TODO Implement Logic
        	response = Response.status(Response.Status.OK).build();
        } catch (final EJBException e) {
            response = Response.status(Response.Status.BAD_REQUEST).entity("JSON Invalid: " + e.getMessage()).build();
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
     * @param resourceId
     *            ID of Service to Delete
     * @return Delete Result
     */
    @DELETE
    @Path("delete")
    public Response deleteService(final Integer resourceId) {
        Response response;

        try {
        	// TODO Implement Logic
        	response = Response.status(Response.Status.OK).build();
        } catch (final EJBException e) {
            response = Response.status(Response.Status.BAD_REQUEST).entity("JSON Invalid: " + e.getMessage()).build();
        }

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
     * @param resourceId
     *            ID of Service to Get
     * @return Service
     */
    @POST
    @Path("get")
    public Response getService(final Integer resourceId) {
        Response response;

        try {
        	// TODO Implement Logic
        	response = Response.status(Response.Status.OK).build();
        } catch (final EJBException e) {
            response = Response.status(Response.Status.BAD_REQUEST).entity("JSON Invalid: " + e.getMessage()).build();
        }

        return response;
    }
}