package com.open.free.service.mybatis.domain;

public class Hotel {
    private Integer city;

    private String name;

    private String address;

    private String zip;

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }
}