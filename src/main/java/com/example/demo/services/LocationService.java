package com.example.demo.services;

import com.example.demo.model.Location;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface LocationService {
    Location getLocationById(Location location);

    Location getLocationByName(Location location);

    List<Location> getLocationsByCountry(Location location);

    List<Location> getLocationsByCountryCode(Location location);

    int addLocation(Location location);

    int deleteLocations(List<Integer> ids);

    @Transactional
    int addLocations(List<Location> locations);

    @Transactional
    int updateLocations(List<Location> locations);
}
