package com.icmi.Shoping.Activities;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.icmi.Shoping.Utils.NetworkChangeReceiver;


public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerReceiver(new NetworkChangeReceiver(), new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
//        getSupportActionBar().hide();
    }
    protected void startActivity(@NonNull Class activity_class, Bundle bundle, @NonNull Boolean finish) {
        Intent i = new Intent(this, activity_class);
        if (bundle != null) {
            i.putExtras(bundle);
        }
        startActivity(i);
        if (finish)
            finish();
    }
}
