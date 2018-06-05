package com.example.bulbul.rrtrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bulbul on 4/20/2018.
 */

public class Contact {

    @SerializedName("name")
    private String Name;

    @SerializedName("email")
    private String Emai;


    public String getName() {
        return Name;
    }

    public String getEmai() {
        return Emai;
    }
}
