package com.icmi.Shoping.Fragments.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.icmi.Shoping.Fragments.FirstFragment;

public class FragmentAdapter extends FragmentStateAdapter {

    private Lifecycle lifecycle;

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager);
        this.lifecycle = lifecycle;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new FirstFragment("Wearable");
            case 2:
                return new FirstFragment("Laptops");
            case 3:
                return new FirstFragment("Phones");
            case 4:
                return new FirstFragment("Drones");
            default:
                return new FirstFragment("Desktop");

        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
