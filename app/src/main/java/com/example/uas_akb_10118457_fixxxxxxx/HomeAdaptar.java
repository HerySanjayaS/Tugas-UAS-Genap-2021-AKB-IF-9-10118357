package com.example.uas_akb_10118457_fixxxxxxx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.database.annotations.NotNull;

public class HomeAdaptar extends FirebaseRecyclerAdapter<HomeModel, HomeAdaptar.myViewHolder> {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    public HomeAdaptar(@NonNull FirebaseRecyclerOptions<HomeModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull HomeModel model) {
        holder.nama.setText(model.getNama());
        holder.alamat.setText(model.getAlamat());
        holder.deskripsi.setText(model.getDeskripsi());

        Glide.with(holder.gambar.getContext())
                .load(model.getGambar())
                .placeholder(R.drawable.common_google_signin_btn_icon_dark)
                .error(R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.gambar);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView gambar;
        TextView nama, alamat, deskripsi;



        public myViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            gambar = (ShapeableImageView) itemView.findViewById(R.id.gambar_wisata);
            nama = (TextView) itemView.findViewById(R.id.nama);
            alamat = (TextView) itemView.findViewById(R.id.alamat);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        }
    }
}
