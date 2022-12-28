package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.webview.databinding.Main;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Main binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.webView.loadUrl("https://m.nbkorea.com/index.action");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://nbapi.nbkorea.com/App.svc/VersionInfo")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }
}