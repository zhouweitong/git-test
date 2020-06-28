package com.zhou;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class Hotel implements Serializable{
    @Field("id")
    private Integer id;
    @Field("hotelName")
    private String hotelName;
    @Field("address")
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
