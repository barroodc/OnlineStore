package com.solvd.onlineshop.model.location;

import javax.xml.bind.annotation.*;
import java.sql.Timestamp;

@XmlRootElement(name = "State")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "countryID", "state", "lastUpdate"})

public class State {
    private Long id;
    private Long countryID;
    private String state;
    private Timestamp lastUpdate;

    public State() {

    }

    public State(Long id, Long countryID, String state) {
        this.id = id;
        this.countryID = countryID;
        this.state = state;
    }

    public State(Long id, Long countryID, String state, Timestamp lastUpdate) {
        this.id = id;
        this.countryID = countryID;
        this.state = state;
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

    @XmlElement(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlElement(name = "lastUpdate")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
