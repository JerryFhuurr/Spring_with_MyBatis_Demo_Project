package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/location/handler")
    public Location getLocationById(Location location) {
        Location locationR = service.getLocationById(location);
        if (locationR != null) {
            log.info("location get! info: " + locationR.toString());
        } else {
            log.error("no matched location found");
        }
        return locationR;
    }

    @RequestMapping("/location/getByCountry/code")
    public List<Location> getLocationsByCountryCode(Location location) {
        List<Location> listR = service.getLocationsByCountryCode(location);
        if (listR.isEmpty()) {
            log.info("no matched location");
        } else {
            log.info(listR.size() + " location(s) found");
        }
        return listR;
    }
}
