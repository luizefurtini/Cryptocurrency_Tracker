package com.example.cryptocurrencytracker;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    String URL = "http://api.coinmarketcap.com/v1/";
    @GET("ticker/?limit=10")
    Call<List<CryptoModel>> getCryptocurrencies();
}
