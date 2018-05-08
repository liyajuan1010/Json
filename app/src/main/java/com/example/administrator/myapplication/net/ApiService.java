package com.example.administrator.myapplication.net;

import com.example.administrator.myapplication.bean.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/5/2.
 */

public interface ApiService {
    @GET("news.php")
    Call<HttpResult<List<News>>> getNews();
}
