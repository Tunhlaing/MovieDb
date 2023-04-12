package com.example.moviedb;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AllApiInterface {
    @GET ("/movie/now_playing")
    Call<List<NowPlayModel>> NowPlay();

}
