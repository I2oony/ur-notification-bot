package com.I2oony.botapi.model;

public class Location {
    private Float latitude;
    private Float longitude;

    public Location(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }
}
