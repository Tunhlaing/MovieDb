package com.example.moviedb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMovieNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMovieNow = findViewById(R.id.rvMovieNow);


    }
    private void setAdapter(List<NowPlayModel> nowPlayModelList){
        NowPlayAdapter nowPlayAdapter = new NowPlayAdapter(nowPlayModelList);


    }
    private void fetchData(){
        Retrofit retrofitObj = RetrofitObj.getRetrofitInstance();
        AllApiInterface allApiInterface = retrofitObj.create(AllApiInterface.class);

        Call<List<NowPlayModel>> postResponse = allApiInterface.NowPlay();

        postResponse.enqueue(new Callback<List<NowPlayModel>>() {
            @Override
            public void onResponse(Call<List<NowPlayModel>> call, Response<List<NowPlayModel>> response) {

            }

            @Override
            public void onFailure(Call<List<NowPlayModel>> call, Throwable t) {

            }
        });


    }
}