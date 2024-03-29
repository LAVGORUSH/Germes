package com.lavgorush.germes.app.model.entity.geography;

import com.lavgorush.germes.app.model.entity.base.AbstractEntity;
import com.lavgorush.germes.app.model.entity.transport.TransportType;

import com.lavgorush.germes.app.model.search.criteria.StationCriteria;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/**
 * Station where passengers can get off or take specific kind
 * of transport. Multiple stations compose route of the trip.
 *
 * @author admin
 */
public class Station extends AbstractEntity {
    private City city;

    private Address address;

    /**
     * (Optional) Phone of the inquiry office
     */
    private String phone;

    private Coordinate coordinate;

    private TransportType transportType;

    /**
     * You shouldn`t create station object directly. Use
     * {@link City} functionality instead
     * @param city
     * @param transportType
     */
    public Station(final City city, final TransportType transportType) {
        this.city = Objects.requireNonNull(city);
        this.transportType = Objects.requireNonNull(transportType);
    }

    public City getCity() {
        return city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    /**
     * Verifies if current station matches specified criteria
     * @param criteria
     * @return
     */
    public boolean match(final StationCriteria criteria) {
        Objects.requireNonNull(criteria, "Station criteria is not initialized");

        if(!StringUtils.isEmpty(criteria.getName())) {
            if(!city.getName().equals(criteria.getName())) {
                return false;
            }
        }

        if(criteria.getTransportType() != null) {
            if(transportType != criteria.getTransportType()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((transportType == null) ? 0 : transportType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Station other = (Station) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (transportType != other.transportType)
            return false;
        return true;
    }

}
