package com.icmi.Shoping.Activities.Home;

import android.os.Bundle;

import com.icmi.Shoping.Activities.Auth.Auth;
import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(Auth.class);

    }
}