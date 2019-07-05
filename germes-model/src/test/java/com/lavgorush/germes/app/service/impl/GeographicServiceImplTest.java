package com.lavgorush.germes.app.service.impl;

import com.lavgorush.germes.app.model.entity.geography.City;
import com.lavgorush.germes.app.service.GeographicService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Contain unit-tests for {@link GeographicServiceImpl}
 * @author admin
 *
 */
public class GeographicServiceImplTest {

    private GeographicService service;

    @Before
    public void setup() {
        service = new GeographicServiceImpl();
    }

    @Test
    public void testNoDataReturnedAtStart() {
        List<City> cities = service.findCities();
        assertTrue(cities.isEmpty());
    }

    @Test
    public void testSaveNewCitySuccess() {
        City city = new City("Odessa");
        service.saveCities(city);

        List<City> cities = service.findCities();
        assertEquals(1, cities.size());
        assertEquals("Odessa", cities.get(0).getName());
    }
}