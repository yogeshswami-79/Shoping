package com.icmi.Shoping.Activities.SearchActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.icmi.Shoping.Fragments.SearchFragment.SearchFragment;
import com.icmi.Shoping.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements SearchContractor.View{
    private final String query = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        onResult(new ArrayList<>());
    }

    @Override
    public void onResult(List<String> result) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl, new SearchFragment<>(result)).commit();
    }
}