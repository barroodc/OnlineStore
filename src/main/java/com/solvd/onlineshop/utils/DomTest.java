package com.solvd.onlineshop.utils;


import com.solvd.onlineshop.model.location.Address;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "DomTest")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = {"id", "husbandName", "wifeName", "marriageStatus"})

public class DomTest {

    private Long id;
    private String husbandName;
    private String wifeName;
    private String marriageStatus;

    public DomTest(){

    }

    public DomTest(Long id, String husbandName, String wifeName, String marriageStatus) {
        this.id = id;
        this.husbandName = husbandName;
        this.wifeName = wifeName;
        this.marriageStatus = marriageStatus;
    }

    @XmlAttribute
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "husbandName")
    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    @XmlElement(name = "wifeName")
    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }


    @XmlElement(name = "marriageStatus")
    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }


    @Override
    public String toString() {
        return "DomTest{" +
                "id=" + id +
                ", husbandName='" + husbandName + '\'' +
                ", wifeName='" + wifeName + '\'' +
                ", marriageStatus='" + marriageStatus + '\'' +
                '}';
    }
}
