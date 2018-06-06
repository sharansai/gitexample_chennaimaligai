package com.example.surya.chennaimaligai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class details extends AppCompatActivity {
    private WebView mWebview;

    String regids;
    String Last_URL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_details);

        mWebview = (WebView) findViewById(R.id.web_view);
        getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

        Last_URL= "http://www.chennaimaligai.com";
        Log.e("URL",""+Last_URL);





        mWebview.getSettings().setJavaScriptEnabled(true);
        mWebview.getSettings().setBuiltInZoomControls(true);
        mWebview.getSettings().setAllowFileAccess(true);
        mWebview.setWebViewClient(new WebViewClient());
        mWebview.setHorizontalScrollBarEnabled(true);
        mWebview.loadUrl(Last_URL);


    }
}
