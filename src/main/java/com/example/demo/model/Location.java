package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {
    private Integer id;
    private String name;
    private String city;
    private String state;
    private String country;
    private String countryCode;
    private Integer postcode;
}
