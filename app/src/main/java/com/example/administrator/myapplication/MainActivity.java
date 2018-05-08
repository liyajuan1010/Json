package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.myapplication.bean.News;
import com.example.administrator.myapplication.net.HttpResult;
import com.example.administrator.myapplication.net.HttpUtil;

import java.util.List;
import java.util.logging.Handler;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button btnJson;
    private TextView tvShowMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }
    private void initView() {
        btnJson=(Button)findViewById(R.id.btn_json);
        tvShowMsg=(TextView)findViewById(R.id.tv_show_msg);

    }
    private void init(){
        btnJson.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_json:
                json();
                break;
        }
    }

    private void json() {
        HttpUtil.requestNews(new Callback<HttpResult<List<News>>>() {
            @Override
            public void onResponse(Call<HttpResult<List<News>>> call, Response<HttpResult<List<News>>> response) {
                List<News> newsList=response.body().getData();
                for(News news:newsList){
                    Log.i(TAG,news.toString());
                }
            }

            @Override
            public void onFailure(Call<HttpResult<List<News>>> call, Throwable t) {

            }
        });
    }
}
