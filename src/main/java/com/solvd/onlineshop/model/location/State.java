package com.solvd.onlineshop.model.location;

import com.solvd.onlineshop.utils.DataTransferObject;

import javax.xml.bind.annotation.*;
import java.sql.Timestamp;

@XmlRootElement(name = "State")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "countryID", "stateName", "lastUpdate"})

public class State implements DataTransferObject {
    private Long id;
    private Long countryID;
    private String stateName;
    private Timestamp lastUpdate;

    public State() {

    }

    public State(Long id, Long countryID, String stateName) {
        this.id = id;
        this.countryID = countryID;
        this.stateName = stateName;
    }

    public State(Long id, Long countryID, String stateName, Timestamp lastUpdate) {
        this.id = id;
        this.countryID = countryID;
        this.stateName = stateName;
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

    @XmlElement(name = "stateName")
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
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
        return "State{" +
                "id=" + id +
                ", countryID=" + countryID +
                ", state='" + stateName + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    @Override
    public long id() {
        return 0;
    }
}
