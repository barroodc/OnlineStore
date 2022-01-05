package com.solvd.onlineshop.model.location;
import javax.xml.bind.annotation.*;
import java.sql.Timestamp;

@XmlRootElement(name = "Address")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "streetAddress", "buildingNumber", "lastUpdate"})

public class Address {
    private Long id;
    private String streetAddress;
    private String buildingNumber;
    private Timestamp lastUpdate;

    public Address() {

    }

    public Address(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Address(String streetAddress, String buildingNumber) {
        this.streetAddress = streetAddress;
        this.buildingNumber = buildingNumber;
    }

    public Address(String streetAddress, Timestamp lastUpdate) {
        this.streetAddress = streetAddress;
        this.lastUpdate = lastUpdate;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "streetAddress")
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @XmlElement(name = "buildingNumber")
    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
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
        return "Address{" +
                "id=" + id +
                ", streetAddress='" + streetAddress + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
