/**
 * 
 */
package net.bryansaunders.dss.exception;

import javax.persistence.NoResultException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Exception Mapper for No Result Exceptions.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@Provider
public class NoResultExceptionMapper implements
		ExceptionMapper<NoResultException> {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Response toResponse(NoResultException exception) {
		return Response.status(Response.Status.NOT_FOUND)
				.entity("Entity Not Found").type(MediaType.APPLICATION_JSON).build();
	}

}
