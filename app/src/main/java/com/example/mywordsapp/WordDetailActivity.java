package com.example.mywordsapp;

import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WordDetailActivity extends AppCompatActivity implements WordDetailFragment.OnFragmentInteractionListener{

    @Override
//    系统首先调用Activity的onCreate()方法，用户可以在这个方法中编写初始化代码，该方法在Activity整个生命周期中只被调用一次
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //横屏退出,getResources资源文件中获取资源，getConfiguration ？？
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        if (savedInstanceState == null) {
            WordDetailFragment detailFragment = new WordDetailFragment();
            detailFragment.setArguments(getIntent().getExtras());
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, detailFragment)
                    .commit();
        }
    }

    @Override
    public void onWordDetailClick(Uri uri) {

    }
}
