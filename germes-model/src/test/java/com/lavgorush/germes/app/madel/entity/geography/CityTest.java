package com.lavgorush.germes.app.madel.entity.geography;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Contains unit-tests to check functionality of {@link City} class
 *
 * @author admin
 */
public class CityTest {

    @Test
    public void testAddValidStationSuccess() {
        Station station = new Station();

        City city = new City();
        city.addStation(station);

        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
}