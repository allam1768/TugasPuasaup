package com.example.tugaspuasa.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.tugaspuasa.R;
import com.example.tugaspuasa.bangun_datar.Jajargenjang;
import com.example.tugaspuasa.bangun_datar.Lingkaran;
import com.example.tugaspuasa.bangun_datar.Prsegi_panjang;
import com.example.tugaspuasa.bangun_datar.Segitiga;
import com.example.tugaspuasa.bangun_datar.Trapesium;
import com.example.tugaspuasa.bangun_datar.segiempat;

public class BangunDatarFragment extends Fragment {

    ImageView jajargenjang;
    ImageView lingkaran;
    ImageView persegi;
    ImageView persegi_panjang;
    ImageView segitiga;
    ImageView trapesium;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        jajargenjang = view.findViewById(R.id.jajargenjang);
        lingkaran = view.findViewById(R.id.lingkaran);
        persegi = view.findViewById(R.id.persegi);
        persegi_panjang = view.findViewById(R.id.persegi_panjang);
        segitiga = view.findViewById(R.id.segitiga);
        trapesium = view.findViewById(R.id.trapesium);

        jajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Jajargenjang.class);
                startActivity(intent);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Lingkaran.class);
                startActivity(intent);
            }
        });

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), segiempat.class);
                startActivity(intent);
            }
        });

        persegi_panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Prsegi_panjang.class);
                startActivity(intent);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Segitiga.class);
                startActivity(intent);
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Trapesium.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
