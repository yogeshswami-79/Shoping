package com.icmi.Shoping.Activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {
    protected void startActivity(Class activity) {
        startActivity(new Intent(this, activity));
        finish();
    }
}
