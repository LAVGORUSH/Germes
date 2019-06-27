package com.lavgorush.germes.app.madel.entity.geography;

/**
 * Value type that stores address attributes
 * of the specific office or person
 *
 * @author admin
 */
public class Address {
    private String zipCode;
    private String street;
    private String hoseNo;

    /**
     * (Optional) Apartment number if it`s address of apartment
     */
    private String apartment;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHoseNo() {
        return hoseNo;
    }

    public void setHoseNo(String hoseNo) {
        this.hoseNo = hoseNo;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
