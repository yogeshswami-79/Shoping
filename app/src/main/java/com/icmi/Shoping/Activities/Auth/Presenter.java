package com.icmi.Shoping.Activities.Auth;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Presenter implements AuthContractor.Presenter {
    private AuthContractor.View mView;

    final String TAG = "PresenterAuth";
    private String verificationCode;
    private PhoneAuthProvider.ForceResendingToken mResendToken;

    public Presenter(@NonNull AuthContractor.View mView) {
        this.mView = mView;
    }

    private void signInWithCredentials(PhoneAuthCredential credential) {
        FirebaseAuth.
                getInstance().
                signInWithCredential(credential).
                addOnSuccessListener(authResult -> Log.d(TAG, "signInWithCredentials: " + authResult.getUser())).
                addOnFailureListener(error -> Log.d(TAG, "signInWithCredentials: " + error.getMessage()));
    }


//  ------------------------------------------------------------------------------------------------------------------------------------

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks callback = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            verificationCode = s;
            mResendToken = forceResendingToken;
//            mView.onOtpSent();
        }

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
            signInWithCredentials(phoneAuthCredential);
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Log.d(TAG, "onVerificationFailed: " + e.getMessage());
        }

    };


    //   ------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void signInWithPhoneNumber(@NonNull Activity activity, @NonNull String phoneNum) {
        PhoneAuthOptions options = new PhoneAuthOptions.Builder(FirebaseAuth.getInstance())
                .setActivity(activity)
                .setPhoneNumber("+91" + phoneNum)
                .setTimeout(60L, TimeUnit.SECONDS)
                .setCallbacks(callback)
                .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }

    @Override
    public void loginWithOtp(@NonNull String otp) {
        PhoneAuthCredential cred = PhoneAuthProvider.getCredential(verificationCode, otp);
        signInWithCredentials(cred);
    }
}