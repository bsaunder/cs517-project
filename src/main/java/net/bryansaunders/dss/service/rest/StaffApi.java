/**
 * 
 */
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

import net.bryansaunders.dss.model.Staff;

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
     * Adds Staff.
     * 
     * <ul>
     * <li>Status 200: Successful Staff Creation.</li>
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
    public Response updateStaff(final Integer staffId) {
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
