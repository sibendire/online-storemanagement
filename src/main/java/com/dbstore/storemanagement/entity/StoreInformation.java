package com.dbstore.storemanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class StoreInformation {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer storeID;
    private String storeName;



    private String storeDetails;
    private String storePhoneNumber;


    public StoreInformation(){

    }


    public StoreInformation( String storeName, String storeDetails, String storePhoneNumber) {

        this.storeName = storeName;
        this.storeDetails = storeDetails;
        this.storePhoneNumber = storePhoneNumber;
    }

    @Override
    public String toString() {
        return "StoreInformation{" +
                "storeID=" + storeID +
                ", storeName='" + storeName + '\'' +
                ", storeDetails='" + storeDetails + '\'' +
                ", storePhoneNumber='" + storePhoneNumber + '\'' +
                '}';
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(String storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }
}
