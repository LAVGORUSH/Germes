package com.lavgorush.germes.app.service.impl;

import com.lavgorush.germes.app.ifra.util.CommonUtil;
import com.lavgorush.germes.app.model.entity.geography.City;
import com.lavgorush.germes.app.service.GeographicService;

import java.util.ArrayList;
import java.util.List;

/**
 * Default implementation of the {@link GeographicService}
 *
 * @author admin
 */
public class GeographicServiceImpl implements GeographicService {
    private final List<City> cities;

    public GeographicServiceImpl() {
        this.cities = new ArrayList<>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCities(City city) {
        if (!cities.contains(city)) {
            cities.add(city);
        }
    }
}
