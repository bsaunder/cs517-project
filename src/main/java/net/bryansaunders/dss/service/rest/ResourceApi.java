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

import net.bryansaunders.dss.model.Resource;

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
     * Adds Resource.
     * 
     * <ul>
     * <li>Status 200: Successful Resource Creation.</li>
     * <li>Status 400: Error Adding Resource.</li>
     * </ul>
     * 
     * @param resource
     *            Resource to Add
     * @return Saved Resource
     */
    @POST
    @Path("add")
    public Response addResource(final Resource resource) {
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
     * Edit Resource.
     * 
     * <ul>
     * <li>Status 200: Successful Resource Update.</li>
     * <li>Status 400: Error Updating Resource.</li>
     * </ul>
     * 
     * @param resource
     *            Resource to Edit
     * @return Updated Resource
     */
    @PUT
    @Path("update")
    public Response updateResource(final Resource resource) {
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
     * List Resource.
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
    @Path("delete")
    public Response deleteResource(final Integer resourceId) {
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
    @Path("get")
    public Response getResource(final Integer resourceId) {
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
