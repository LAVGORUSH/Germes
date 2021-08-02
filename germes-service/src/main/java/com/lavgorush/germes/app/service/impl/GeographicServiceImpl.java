package com.lavgorush.germes.app.service.impl;

import com.lavgorush.germes.app.infra.util.CommonUtil;
import com.lavgorush.germes.app.model.entity.geography.City;
import com.lavgorush.germes.app.model.entity.geography.Station;
import com.lavgorush.germes.app.model.search.criteria.StationCriteria;
import com.lavgorush.germes.app.model.search.criteria.range.RangeCriteria;
import com.lavgorush.germes.app.service.GeographicService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

/**
 * Default implementation of the {@link GeographicService}
 *
 * @author admin
 */
public class GeographicServiceImpl implements GeographicService {

	/**
	 * Internal list of cities
	 */
	private final List<City> cities;

	/**
	 * Auto-increment counter for entity id generation
	 */
	private int counter = 0;

	public GeographicServiceImpl() {
		this.cities = new ArrayList<>();
	}

	@Override
	public List<City> findCities() {
		return CommonUtil.getSafeList(cities);
	}

	@Override
	public void saveCity(City city) {
		if (!cities.contains(city)) {
			city.setId(++counter);
			cities.add(city);
		}
	}

	@Override
	public Optional<City> findCityById(int id) {
		return cities.stream().filter(city -> city.getId() == id).findFirst();
	}

	@Override
	public List<Station> searchStations(StationCriteria criteria, RangeCriteria rangeCriteria) {
		Stream<City> stream = cities.stream()
			.filter(city -> StringUtils.isEmpty(criteria.getName()) || city.getName()
				.equals(criteria.getName()));
		Optional<Set<Station>> stations = stream.map(city -> city.getStations())
			.reduce((stations1, stations2) -> {
				HashSet<Station> newStations = new HashSet<>(stations2);
				newStations.addAll(stations1);
				return newStations;
			});
		if (!stations.isPresent()) {
			return Collections.emptyList();
		}

		return stations.get().stream().filter(station -> criteria.getTransportType() == null
			|| station.getTransportType() == criteria.getTransportType())
			.collect(Collectors.toList());
	}

}
