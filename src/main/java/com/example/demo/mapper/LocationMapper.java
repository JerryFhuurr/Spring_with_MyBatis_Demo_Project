package com.example.demo.mapper;

import com.example.demo.model.Location;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LocationMapper {
    Location getLocationById(Location location);

    Location getLocationByName(Location location);

    List<Location> getLocationsByCountry(Location location);

    List<Location> getLocationsByCountryCode(Location location);

    int addLocation(Location location);

    int deleteLocations(List<Integer> ids);

    int addLocations(List<Location> locations);
}
