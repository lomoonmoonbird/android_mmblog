package com.moonmoonbird.mmblog.services;

import com.moonmoonbird.mmblog.model.ThreadList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ThreadsService {
    @GET("index")
    public Call<ThreadList> getGoodList(@Header("apiKey") String apiKey, @Query("page") int id);
}


