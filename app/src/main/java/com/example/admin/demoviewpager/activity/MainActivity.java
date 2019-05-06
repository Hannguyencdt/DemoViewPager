package com.example.admin.demoviewpager.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.demoviewpager.R;
import com.example.admin.demoviewpager.adapter.ViewPagerAdapter;
import com.example.admin.demoviewpager.fragment.CategoryFragment;
import com.example.admin.demoviewpager.fragment.HomeFragment;
import com.example.admin.demoviewpager.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayoutMain;
    private ViewPager viewPagerMain;

    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initViewPagerHome();
    }


    private void initView() {
        tabLayoutMain = findViewById(R.id.tabLayoutMain);
        viewPagerMain = findViewById(R.id.viewPagerMain);
    }

    private void initViewPagerHome() {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new CategoryFragment(), "Category");
        adapter.addFragment(new ProfileFragment(), "Profile");
        viewPagerMain.setAdapter(adapter);
        tabLayoutMain.setupWithViewPager(viewPagerMain);
    }

}
