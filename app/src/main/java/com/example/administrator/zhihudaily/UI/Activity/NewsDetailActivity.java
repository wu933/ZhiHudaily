package com.example.administrator.zhihudaily.UI.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.ViewFlipper;

import com.example.administrator.zhihudaily.R;

public class NewsDetailActivity extends Activity {

    //新闻详情主体
    private ViewFlipper newsbody;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局xml
        setContentView(R.layout.news_details);

        String newsContent = "20181024----test----newscontent";  //新闻内容

        newsbody = (ViewFlipper) findViewById(R.id.news_detail_body_flipper);
        //获得当前绑定的layout实例
        layoutInflater = getLayoutInflater();

        //使用加载布局文件到当前绑定的layout中实现内容填充
        View view = layoutInflater.inflate(R.layout.news_detail_body, null);
        WebView webView = (WebView) view.findViewById(R.id.news_detail_body_wv);
        webView.loadUrl("https://www.baidu.com/");
        //当前内容尚不能显示，只保证能调用过来
        newsbody.addView(view);
    }
}
