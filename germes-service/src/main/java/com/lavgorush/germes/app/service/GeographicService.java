package com.lavgorush.germes.app.service;

import com.lavgorush.germes.app.model.entity.geography.City;

import java.util.List;

/**
 * Entity point to perform operations
 * over geographic entities
 *
 * @author admin
 */
public interface GeographicService {
    /**
     * Returns list of existing cities
     * @return
     */
    List<City> findCities();

    /**
     * Saves specified city instance
     * @param city
     */
    void saveCities(City city);
}
