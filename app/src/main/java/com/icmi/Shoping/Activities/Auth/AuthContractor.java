package com.icmi.Shoping.Activities.Auth;

import android.app.Activity;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseUser;

public interface AuthContractor {
    interface View {
        void onOtpSent();

        void onSuccess();

        void onError(Exception e);

        void registeruser(FirebaseUser user);
    }

    interface Presenter {
        void signInWithPhoneNumber(@NonNull Activity activity, @NonNull final String phoneNum);

        void loginWithOtp(@NonNull final String Otp);
    }
}
