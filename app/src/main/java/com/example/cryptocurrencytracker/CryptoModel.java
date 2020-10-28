package com.example.cryptocurrencytracker;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("name")
    String name;

    @SerializedName("price_usd")
    String price_usd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    @Override
    public String toString() {
        return "CryptoModel{" +
                "name='" + name + '\'' +
                ", price_usd='" + price_usd + '\'' +
                '}';
    }
}
