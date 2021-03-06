package com.geektech.weatherapp.data.models;

import com.google.gson.annotations.SerializedName;

public class Sys {

    @SerializedName("type")
    private Integer type;
    @SerializedName("id")
    private Integer id;
    @SerializedName("message")
    private Double message;
    @SerializedName("country")
    private String country;
    @SerializedName("sunrise")
    private Long sunrise;
    @SerializedName("sunset")
    private Long sunset;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }
}
