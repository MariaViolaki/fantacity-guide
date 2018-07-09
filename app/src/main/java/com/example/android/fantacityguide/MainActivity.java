package com.example.android.fantacityguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;


public class MainActivity extends AppCompatActivity {

    // Connects the TabLayout to a ViewPager allowing the user to navigate between Fragments
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(categoryAdapter);

        viewPager.getBackground();

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.icon_districts);
        tabLayout.getTabAt(1).setIcon(R.drawable.icon_forests);
        tabLayout.getTabAt(2).setIcon(R.drawable.icon_attractions);
        tabLayout.getTabAt(3).setIcon(R.drawable.icon_facilities);
    }
}