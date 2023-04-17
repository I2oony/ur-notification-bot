package com.I2oony.shops.model;

import com.I2oony.botapi.model.Location;

public class Shop {
    // TODO: create object and methods for Shop entity

    private Integer id;
    private String code;
    private String displayCode;
    private String address;
    private String managerName;
    private String shopPhone;
    private String managerPhone;
    private Region region;
    private City city;
    private Location location;

    // TODO: constructor might take json string and parse it to the object
//    public Shop(String json) {
//        try {
//            // TODO: check how to do better parsing
//            Object object = new JSONParser().parse(json);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public Location getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }
}
