package com.example.eosinchen.webviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 按下按鈕之後的事件
    public void onButtonClick(View v) {

        // 網址的內容
        String strURL;

        // 取得網址的內容
        EditText editText = (EditText) findViewById(R.id.editText);
        strURL = editText.getText().toString();

        if(strURL.isEmpty()) {
            strURL = "http://www.wfu.edu.tw";
        }

        // 用 WebView 來查看網頁內容
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(strURL);
    }
}