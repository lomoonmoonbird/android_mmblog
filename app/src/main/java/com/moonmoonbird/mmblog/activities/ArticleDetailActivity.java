package com.moonmoonbird.mmblog.activities;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.moonmoonbird.mmblog.R;

public class ArticleDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_fragment);
        Toast.makeText(this, "aaa", Toast.LENGTH_SHORT).show();
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://www.example.com");
    }
}
