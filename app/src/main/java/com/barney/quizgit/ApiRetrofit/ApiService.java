package com.barney.quizgit.ApiRetrofit;

import com.barney.quizgit.model.ResponseReadData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("read_data.php")
    Call<ResponseReadData> response_read_data();
}
