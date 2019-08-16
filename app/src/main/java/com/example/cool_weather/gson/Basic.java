package com.example.cool_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 包含城市的基本状况
 */
public class Basic {

    @SerializedName("name")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
