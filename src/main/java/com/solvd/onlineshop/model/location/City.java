package com.solvd.onlineshop.model.location;

import java.sql.Timestamp;

public class City {
    private Long id;
    private Long countryID;
    private String city;
    private byte[] location;
    private String postalCode;
    private Timestamp lastUpdate;
}
