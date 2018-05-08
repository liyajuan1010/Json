package com.example.administrator.myapplication.net;

import com.example.administrator.myapplication.bean.News;
import com.example.administrator.myapplication.util.Constant;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpUtil {
    public static void requestNews(Callback<HttpResult<List<News>>> callback){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Constant.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService=retrofit.create(ApiService.class);
        Call<HttpResult<List<News>>> call=apiService.getNews();
        call.enqueue(callback);
    }
}
