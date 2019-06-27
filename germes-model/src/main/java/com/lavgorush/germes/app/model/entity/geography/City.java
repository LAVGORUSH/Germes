package com.lavgorush.germes.app.model.entity.geography;

import com.lavgorush.germes.app.model.entity.base.AbstractEntity;
import com.lavgorush.germes.app.model.entity.transport.TransportType;

import java.util.*;

/**
 * Any location that contains transport stations
 *
 * @author admin
 */
public class City extends AbstractEntity {
    private String name;
    /**
     * Name of the district where city is placed
     */
    private String district;
    /**
     * Name of the region where district is located
     * Region is top-level area in the country
     */
    private String region;
    /**
     * Set of transport stations that is linked to this
     * loyality
     */
    private Set<Station> stations;

    public City(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Set<Station> getStations() {
        return Collections.unmodifiableSet(Optional.ofNullable(stations).orElse(Collections.emptySet()));
    }

    public void setStations(Set<Station> stations) {
        this.stations = stations;
    }

    /**
     * Add specified station to the city station list
     * @param transportType
     * @return
     */
    public Station addStation(final TransportType transportType) {
        if (stations == null) {
            stations = new HashSet<>();
        }
        Station station = new Station(this, transportType);
        stations.add(station);
        return station;
    }
    /**
     * Remove specified station from city station list
     * @param station
     */
    public void removeStation(Station station) {
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (stations == null) {
            return;
        }
        stations.remove(station);
    }
}
