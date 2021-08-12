package com.example.uas_akb_10118457_fixxxxxxx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class pagerAdapter extends RecyclerView.Adapter<pagerAdapter.ViewPagerHolder> {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    private List<Itempager> itemPager;

    public pagerAdapter(List<Itempager> viewPagerItems) {
        this.itemPager = viewPagerItems;
    }

    @NonNull
    @Override
    public ViewPagerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerHolder holder, int position) {
        holder.setViewPagerData(itemPager.get(position));
    }

    @Override
    public int getItemCount() {
        return itemPager.size();
    }

    class ViewPagerHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;

        public ViewPagerHolder(@NonNull View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.title_view_pager);
            imageView = itemView.findViewById(R.id.image_view_pager);
        }

        void setViewPagerData(Itempager viewPagerItem){
            textView.setText(viewPagerItem.getTitle());
            imageView.setImageResource(viewPagerItem.getImage());
        }
    }
}
