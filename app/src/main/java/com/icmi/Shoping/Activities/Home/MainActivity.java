package com.icmi.Shoping.Activities.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.icmi.Shoping.Activities.Auth.Auth;
import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.Fragments.Adapters.FragmentAdapter;
import com.icmi.Shoping.R;

public class MainActivity extends BaseActivity {
    ViewPager2 vp;
    TabLayout tl;
    FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.itemViewPager);
        tl = findViewById(R.id.category_tabLayout);
        adapter = new FragmentAdapter(getSupportFragmentManager(), getLifecycle());

        vp.setAdapter(adapter);

        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        vp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tl.selectTab(tl.getTabAt(position));
            }
        });

    }
}