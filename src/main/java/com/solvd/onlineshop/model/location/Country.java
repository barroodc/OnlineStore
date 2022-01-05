package com.solvd.onlineshop.model.location;

import javax.xml.bind.annotation.*;
import java.sql.Timestamp;

@XmlRootElement(name = "Country")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "countryName", "currencyName", "phoneCode", "lastUpdate"})

public class Country {
    private Long id;
    private String countryName;
    private String currencyName;
    private String phoneCode;
    private Timestamp lastUpdate;

    public Country() {

    }

    public Country(Long id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public Country(Long id, String countryName, String currencyName) {
        this.id = id;
        this.countryName = countryName;
        this.currencyName = currencyName;
    }

    public Country (Long id, String countryName, String currencyName, String phoneCode) {
        this.id = id;
        this.countryName = countryName;
        this.currencyName = currencyName;
        this.phoneCode = phoneCode;
    }

    public Country(Long id, String countryName, String currencyName, String phoneCode, Timestamp lastUpdate) {
        this.id = id;
        this.countryName = countryName;
        this.currencyName = currencyName;
        this.phoneCode = phoneCode;
        this.lastUpdate = lastUpdate;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "countryName")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @XmlElement(name = "currencyName")
    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    @XmlElement(name = "phoneCode")
    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
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
        return "Country{" +
                "id=" + id +
                ", country='" + countryName + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
