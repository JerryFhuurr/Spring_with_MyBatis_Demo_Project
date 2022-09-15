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

    // name must be camel case
    private Integer lId;  //l_id
    private String lName;  //l_name
    private String lCity;  //l_city
    private String lState;  //l_state
    private String lCountry;  //l_country
    private String lCountryCode;  //l_country_code
    private String lPostcode;  //l_postcode
}
