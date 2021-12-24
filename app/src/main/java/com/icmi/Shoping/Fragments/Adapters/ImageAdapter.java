package com.icmi.Shoping.Fragments.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.icmi.Shoping.R;
import com.squareup.picasso.Picasso;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private ViewPager2 viewPager2;

    public ImageAdapter(ViewPager2 viewPager2) {
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            final String url = "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/FWW12?wid=1144&hei=1144&fmt=jpeg&qlt=80&.v=1580325951651";
            Picasso.get().load(url).into((ImageView) itemView.findViewById(R.id.item_image));
        }
    }
}
