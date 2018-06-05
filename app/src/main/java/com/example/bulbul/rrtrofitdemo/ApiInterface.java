package com.example.bulbul.rrtrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by bulbul on 4/20/2018.
 */

public interface ApiInterface {

    @POST("readcontacts.php")
   Call<List<Contact>> getContacts();
}
