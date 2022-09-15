package com.example.demo.services;

import com.example.demo.model.Location;

import java.util.List;

public interface LocationService {
    Location getLocationById(Location location);

    Location getLocationByName(Location location);

    List<Location> getLocationsByCountry(Location location);

    List<Location> getLocationsByCountryCode(Location location);

    int addLocation(Location location);

    int deleteLocations(List<Integer> ids);

    int addLocations(List<Location> locations);
}
