package com.example.demo.services.Impl;

import com.example.demo.mapper.LocationMapper;
import com.example.demo.model.Location;
import com.example.demo.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("locationService")
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationMapper locationMapper;

    @Override
    public Location getLocationById(Location location) {
        return locationMapper.getLocationById(location);
    }

    @Override
    public Location getLocationByName(Location location) {
        return locationMapper.getLocationByName(location);
    }

    @Override
    public List<Location> getLocationsByCountry(Location location) {
        return locationMapper.getLocationsByCountry(location);
    }

    @Override
    public List<Location> getLocationsByCountryCode(Location location) {
        return locationMapper.getLocationsByCountryCode(location);
    }
}
