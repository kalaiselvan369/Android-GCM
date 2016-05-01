package com.example.airbase.kalaigcmdemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Airbase on 01-May-16.
 */
public interface ApiEndPoint {
    @FormUrlEncoded
    @POST("?shareRegId=true")
    Call<ResponseBody> createGcm(@Field("regId")String token);
}
