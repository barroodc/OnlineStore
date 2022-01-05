package com.solvd.onlineshop.model.location;

import javax.xml.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Arrays;

@XmlRootElement(name = "City")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "countryID", "city", "location", "postalCode", "lastUpdate"})

public class City {
    private Long id;
    private Long countryID;
    private String city;
    private byte[] location;
    private String postalCode;
    private Timestamp lastUpdate;

    public City() {

    }

    public City(Long id, Long countryID) {
        this.id = id;
        this.countryID = countryID;
    }

    public City(Long id, Long countryID, String city, byte[] location, String postalCode) {
        this.id = id;
        this.countryID = countryID;
        this.city = city;
        this.location = location;
        this.postalCode = postalCode;
    }

    public City(Long id, Long countryID, String city, byte[] location, String postalCode, Timestamp lastUpdate) {
        this.id = id;
        this.countryID = countryID;
        this.city = city;
        this.location = location;
        this.postalCode = postalCode;
        this.lastUpdate = lastUpdate;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlAttribute
    public Long getCountryID() {
        return countryID;
    }

    public void setCountryID(Long countryID) {
        this.countryID = countryID;
    }

    @XmlElement(name = "getCity")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "getLocation")
    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }

    @XmlElement(name = "getPostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @XmlElement(name = "getLastUpdate")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", countryID=" + countryID +
                ", city='" + city + '\'' +
                ", location=" + Arrays.toString(location) +
                ", postalCode='" + postalCode + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
