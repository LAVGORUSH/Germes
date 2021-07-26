package com.lavgorush.germes.app.rest.dto;

import com.lavgorush.germes.app.model.entity.geography.City;
import com.lavgorush.germes.app.rest.dto.base.BaseDTO;

/**
 * Hold city state for the client server communication
 *
 * @author lavgo
 */
public class CityDTO extends BaseDTO<City> {

	private String name;
	private String district;
	private String region;

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

}
