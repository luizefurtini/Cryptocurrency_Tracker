package com.example.cryptocurrencytracker;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    public static APIService getService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIService.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(APIService.class);
    }
}
