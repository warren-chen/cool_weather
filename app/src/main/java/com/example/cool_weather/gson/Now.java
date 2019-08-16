package com.example.cool_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 当前的空气信息
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("tet")
        public String info;
    }
}
