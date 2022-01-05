package com.icmi.Shoping.Activities.Auth;

import android.os.Bundle;

import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.Activities.Home.MainActivity;
import com.icmi.Shoping.R;

public class Auth extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(MainActivity.class, null, true);
    }
}