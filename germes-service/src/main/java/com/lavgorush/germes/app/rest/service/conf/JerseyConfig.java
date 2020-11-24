package com.lavgorush.germes.app.rest.service.conf;


import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * REST web-service configuration for Jersey
 *
 * @author lavgorush
 */
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.lavgorush.germes.api.rest");
    }
}
