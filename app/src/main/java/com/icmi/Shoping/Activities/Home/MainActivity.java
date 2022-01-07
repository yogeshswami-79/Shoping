package com.icmi.Shoping.Activities.Home;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.SearchView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.icmi.Shoping.Activities.Auth.Auth;
import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.Activities.OrderHistory.OrderHistoryActivity;
import com.icmi.Shoping.Activities.Profile.ProfileActivity;
import com.icmi.Shoping.Activities.SearchActivity.SearchActivity;
import com.icmi.Shoping.Fragments.Adapters.ImageAdapter;
import com.icmi.Shoping.R;
import com.icmi.Shoping.databinding.ActivityMainBinding;
import com.icmi.Shoping.databinding.BottomNavbarBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    ViewPager2 vp;
    TabLayout tl;

//    FragmentAdapter adapter;

    private void initView() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        intializeViewComponents();


//        adapter = new FragmentAdapter(getSupportFragmentManager(), getLifecycle());
        ImageAdapter adapter = new ImageAdapter(vp);
        vp.setAdapter(adapter);

        vp.offsetLeftAndRight(1);
        vp.setClipChildren(false);
        vp.setClipToPadding(false);
        vp.setPadding(-80, 0, 80, 0);
        vp.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        vp.setPageTransformer((page, position) -> {
            float r = 1 - Math.abs(position);
            page.setScaleY(0.85f + r * 0.14f);
        });

        vp.setTranslationX(80);
        vp.setTranslationY(40);
//
//        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                vp.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        vp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                tl.selectTab(tl.getTabAt(position));
//            }
//        });


    }


    private void setMenuClickListeners() {
        findViewById(R.id.home).setOnClickListener(v-> Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show());
        findViewById(R.id.liked).setOnClickListener(v->startActivity(Auth.class,null,true));
        findViewById(R.id.cart).setOnClickListener(v->startActivity(OrderHistoryActivity.class, null, false));
        findViewById(R.id.profile).setOnClickListener(v->startActivity(ProfileActivity.class,null,false));

    }


    private void intializeViewComponents() {
        vp = binding.itemViewPager;
        tl = binding.categoryTabLayout;

        setMenuClickListeners();
//        findViewById(R.id.profile).setOnClickListener(v -> startActivity(Auth.class, null, false));

        ImageButton menuBtn = findViewById(R.id.menuBtn);
        DrawerLayout dl = findViewById(R.id.dl);
        NavigationView nv = findViewById(R.id.navview);

        menuBtn.setOnClickListener(v -> dl.openDrawer(nv));

//SearchView
        SearchView sv = findViewById(R.id.searchview);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                sv.setQuery("", false);
                startActivity(SearchActivity.class, null, false);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

    }

}