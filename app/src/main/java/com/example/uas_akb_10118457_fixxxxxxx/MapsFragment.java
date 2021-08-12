package com.example.uas_akb_10118457_fixxxxxxx;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends Fragment {

    //Tanggal   : 10 Agustus 2021
    //NIM       : 10118357
    //Nama      : Hery Sanjaya Situmorang
    //Kelas     : IF9


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.google_maps);

        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                LatLng asiaafrika = new LatLng(-6.9210673,107.6066878);
                LatLng curugcimahi = new LatLng(-6.9211092,107.609597);
                LatLng farmhouselembang = new LatLng(-6.833203,107.6034321);
                LatLng orchidforest = new LatLng(-6.78049,107.6352863);
                LatLng grafikacikole = new LatLng(-6.7851907,107.6494017);

                googleMap.addMarker(new MarkerOptions().position(asiaafrika).title("Museum Asia Afrika"));
                googleMap.addMarker(new MarkerOptions().position(curugcimahi).title("Curug Cimahi"));
                googleMap.addMarker(new MarkerOptions().position(farmhouselembang).title("Farm House Lembang"));
                googleMap.addMarker(new MarkerOptions().position(orchidforest).title("Orchid forest"));
                googleMap.addMarker(new MarkerOptions().position(grafikacikole).title("Grafika Cikole"));

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(curugcimahi,11));
            }
        });

        return view;
    }


}