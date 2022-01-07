package com.icmi.Shoping.Activities.Auth;

import android.os.Bundle;
import android.view.View;
import com.google.firebase.auth.FirebaseUser;
import com.icmi.Shoping.Activities.BaseActivity;
import com.icmi.Shoping.Activities.Home.MainActivity;
import com.icmi.Shoping.databinding.ActivityAuthBinding;



public class Auth extends BaseActivity implements AuthContractor.View{

    private AuthContractor.Presenter presenter;
    private ActivityAuthBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAuthBinding.inflate(getLayoutInflater());
        presenter = new Presenter(this);

        initView();
    }

    private void initView() {
        View v = binding.getRoot();
        setContentView(v);
    }

//  ------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void onOtpSent() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError(Exception e) {

    }

    @Override
    public void registeruser(FirebaseUser user) {

    }

//  ------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(MainActivity.class, null, true);
    }

}