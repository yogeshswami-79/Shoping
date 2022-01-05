package com.icmi.Shoping.Fragments.SearchFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.icmi.Shoping.Activities.Home.MainActivity;
import com.icmi.Shoping.Activities.ItemViewActivity.ItemActivity;
import com.icmi.Shoping.Fragments.BaseFragment;
import com.icmi.Shoping.R;

import java.util.List;

public class SearchFragment<T> extends BaseFragment {
    private List<T> items;

    public SearchFragment(@NonNull List<T> items) {
        this.items = items;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        @LayoutRes int layout = items.size()>0? R.layout.fragment_search : R.layout.layout_no_results;
        return inflater.inflate(layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.setOnClickListener(v->startActivity(ItemActivity.class, null, false));
    }

}
