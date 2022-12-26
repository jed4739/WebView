package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.webview.databinding.Main;

public class MainActivity extends AppCompatActivity {
    Main binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.webView.loadUrl("https://m.nbkorea.com/index.action");
    }
}