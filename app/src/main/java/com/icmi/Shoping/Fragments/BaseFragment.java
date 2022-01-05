package com.icmi.Shoping.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {

    protected void startActivity(@NonNull Class activity_class, Bundle bundle, @NonNull Boolean finish) {
        Intent i = new Intent(getContext(), activity_class);
        if (bundle != null) {
            i.putExtras(bundle);
        }
        startActivity(i);
        if (finish)
            getActivity().finish();
    }
}
