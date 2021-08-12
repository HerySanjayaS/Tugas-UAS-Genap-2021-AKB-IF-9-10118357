package com.example.uas_akb_10118457_fixxxxxxx;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;


public class HomeFragment extends Fragment {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9

    RecyclerView recyclerView;
    HomeAdaptar homeAdaptar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FirebaseRecyclerOptions<HomeModel> options =
                new FirebaseRecyclerOptions.Builder<HomeModel>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("wisatabandung"), HomeModel.class)
                .build();

        homeAdaptar = new HomeAdaptar(options);
        recyclerView.setAdapter(homeAdaptar);

        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        homeAdaptar.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        homeAdaptar.stopListening();
    }
}