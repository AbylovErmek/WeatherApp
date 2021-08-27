package com.geektech.weatherapp.data.remote;

import com.geektech.weatherapp.data.models.currentweather.CurrentWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApi {

    @GET("weather")
    Call<CurrentWeather> getCityWeather(
            @Query("q") String city_name,
            @Query("appid") String appid
    );
}
