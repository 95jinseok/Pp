package com.tistory.codedragon.pp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();

        mTabLayout = (TabLayout)findViewById(R.id.layout_tab);

        mTabLayout.addTab(mTabLayout.newTab().setText("a"));
        mTabLayout.addTab(mTabLayout.newTab().setText("b"));
        mTabLayout.addTab(mTabLayout.newTab().setText("c"));
        mTabLayout.addTab(mTabLayout.newTab().setText("d"));
        mTabLayout.addTab(mTabLayout.newTab().setText("e"));







        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }
}
