package com.icmi.Shoping.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.icmi.Shoping.R;
import com.squareup.picasso.Picasso;

public class FirstFragment extends Fragment {
    private final String title;
    private String url;

    public FirstFragment(@NonNull String title) {
        this.url = "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/FWW12?wid=1144&hei=1144&fmt=jpeg&qlt=80&.v=1580325951651";
        this.title = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ImageView iv = view.findViewById(R.id.item_image);
        Picasso.get().load(url).into(iv);
    }

}