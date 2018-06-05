package com.example.bulbul.rrtrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bulbul on 4/20/2018.
 */

public class ApiClient {

    public static final String BASE_URL="http://192.168.0.101/contactapp/";
    public static Retrofit retrofit=null;

    public static Retrofit getApiClient(){

        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
