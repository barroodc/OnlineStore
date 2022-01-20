package com.solvd.onlineshop.model.location;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.sql.Timestamp;
import java.util.Arrays;

@XmlRootElement(name = "City")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "countryID", "cityName", "location", "zipCode", "lastUpdate"})

public class City {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("countryID")
    private Long countryID;
    @JsonProperty("cityName")
    private String cityName;
    @JsonProperty("location")
    private byte[] location;
    @JsonProperty("zipCode")
    private String zipCode;
    @JsonProperty("lastUpdate")
    private Timestamp lastUpdate;

    public City() {

    }

    public City(String cityName){
        this.cityName = cityName;
    }

    public City(Long id, Long countryID) {
        this.id = id;
        this.countryID = countryID;
    }

    public City(Long id, Long countryID, String cityName, byte[] location, String zipCode) {
        this.id = id;
        this.countryID = countryID;
        this.cityName = cityName;
        this.location = location;
        this.zipCode = zipCode;
    }

    public City(Long id, Long countryID, String cityName, byte[] location, String zipCode, Timestamp lastUpdate) {
        this.id = id;
        this.countryID = countryID;
        this.cityName = cityName;
        this.location = location;
        this.zipCode = zipCode;
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

    @XmlElement(name = "cityName")
    public String getCityName() {
        return cityName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }

    @XmlElement(name = "location")
    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }

    @XmlElement(name = "zipCode")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @XmlElement(name = "lastUpdate")
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
                ", cityName='" + cityName + '\'' +
                ", location=" + Arrays.toString(location) +
                ", zipCode='" + zipCode + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
