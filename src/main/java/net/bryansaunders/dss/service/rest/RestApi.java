package net.bryansaunders.dss.service.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Defines the Root path for the RESTful API.
 * 
 * @author Bryan Saunders <btsaunde@gmail.com>
 * 
 */
@ApplicationPath("/rest")
public class RestApi extends Application {

    /**
     * Header name for USER Public API Key.
     */
    public static final String PUBLIC_KEY_HEADER = "X-Auth-Key";

    /**
     * Header name for REST Signature.
     */
    public static final String SIGNATURE_HEADER = "X-Auth-Signature";

    /**
     * Header name for Content Hash.
     */
    public static final String CONTENT_HASH_HEADER = "Content-Hash";
}
