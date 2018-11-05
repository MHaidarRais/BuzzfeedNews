package com.rais.haidar.buzzfeeds.ApiRetrofit;

import com.rais.haidar.buzzfeeds.Model.ResponseBuzzfeed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("top-headlines?sources=buzzfeed&apiKey=742f9c39ed6c4d5c8874aadb10b34b79")
    Call<ResponseBuzzfeed> readNews();
}
