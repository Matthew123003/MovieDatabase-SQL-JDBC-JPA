package io.zipcoder.persistenceapp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName;
    private String lName;
    @Column(name = "birthday")
    private Date bDate;
    private String mobileNumber;
    private Integer homeId;

    public Person(){
        fName = "Peter";
        lName = "Parker";
        bDate = new Date();
        mobileNumber = "1234567890";
        homeId = 1;
    }

    public Person(String fName, String lName, Date bDate, String mobileNumber, Integer homeId){
        this.fName = fName;
        this.lName = lName;
        this.bDate = bDate;
        this.mobileNumber = mobileNumber;
        this.homeId = homeId;
    }

    public Person(Long id, String fName, String lName, Date bDate, String mobileNumber, Integer homeId){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.bDate = bDate;
        this.mobileNumber = mobileNumber;
        this.homeId = homeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public Date getBDate() {
        return bDate;
    }

    public void setBDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public String toString(){
        return "Person [id=" + id + ", First Name =" + fName + ", Last Name =" + lName
                + ", Birthday =" + bDate + ", Mobile Number =" + mobileNumber + "]";
    }
}
