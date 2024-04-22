package io.zipcoder.persistenceapp;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//@Entity
public class Person {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fName;
    private String lName;
    private String bDate;
    private String mobileNumber;

    public Person(){}

    public Person(String fName, String lName, String bDate, String mobileNumber){
        this.fName = fName;
        this.lName = lName;
        this.bDate = bDate;
        this.mobileNumber = mobileNumber;
    }

    public Person(Integer id, String fName, String lName, String bDate, String mobileNumber){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.bDate = bDate;
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getBDate() {
        return bDate;
    }

    public void setBDate(String bDate) {
        this.bDate = bDate;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String toString(){
        return "Person [id=" + id + ", First Name =" + fName + ", Last Name =" + lName
                + ", Birthday =" + bDate + ", Mobile Number =" + mobileNumber + "]";
    }
}
