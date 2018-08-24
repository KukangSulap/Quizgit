package com.barney.quizgit.ApiRetrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InstanceRetrofit {
    private static final String Weburl = "http://192.168.10.18/crudrumahsakit/";

    private static Retrofit setInit() {
        return new  Retrofit.Builder()
                .baseUrl(Weburl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getInstance() {
        return setInit() .create(ApiService.class);}
}
