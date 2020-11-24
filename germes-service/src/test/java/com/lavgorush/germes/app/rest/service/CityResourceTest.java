package com.lavgorush.germes.app.rest.service;

import com.lavgorush.germes.app.rest.service.conf.JerseyConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CityResourceTest extends JerseyTest {
    public CityResourceTest() {
        super(new JerseyConfig());

    }

    @Test
    @Ignore
    public void testFindCitiesSuccess() {
        getBaseUri().getPath();
        List<?> cities = target("/api/cities").request().get(List.class);
        assertNotNull(cities);
        assertTrue(cities.contains("Odessa"));
        assertTrue(cities.contains("Kiyv"));
    }
}