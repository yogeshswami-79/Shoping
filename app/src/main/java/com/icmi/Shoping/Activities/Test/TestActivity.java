package com.icmi.Shoping.Activities.Test;


import android.os.Bundle;

import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.Activities.Home.MainActivity;
import com.icmi.Shoping.R;

public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_no_order_history);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(MainActivity.class, null, true);
    }
}