package com.icmi.Shoping.Activities.ItemViewActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.R;

public class ItemActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        View v = getLayoutInflater().inflate(R.layout.test, null);
        View v1 = getLayoutInflater().inflate(R.layout.test, null);
        View v2 = getLayoutInflater().inflate(R.layout.test, null);
        View v3 = getLayoutInflater().inflate(R.layout.test, null);
        View v4 = getLayoutInflater().inflate(R.layout.test, null);
        View v5 = getLayoutInflater().inflate(R.layout.test, null);

        ((LinearLayout) findViewById(R.id.ll)).addView(v);
        ((LinearLayout) findViewById(R.id.ll)).addView(v1);
        ((LinearLayout) findViewById(R.id.ll)).addView(v2);
        ((LinearLayout) findViewById(R.id.ll)).addView(v3);
        ((LinearLayout) findViewById(R.id.ll)).addView(v4);
        ((LinearLayout) findViewById(R.id.ll)).addView(v5);

    }
}
