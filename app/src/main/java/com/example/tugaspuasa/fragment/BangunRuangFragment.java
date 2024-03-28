package com.example.tugaspuasa.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.tugaspuasa.R;
import com.example.tugaspuasa.bangun_ruang.Balok;
import com.example.tugaspuasa.bangun_ruang.Kerucut;
import com.example.tugaspuasa.bangun_ruang.Kubus;
import com.example.tugaspuasa.bangun_ruang.Limas;
import com.example.tugaspuasa.bangun_ruang.Bola;
import com.example.tugaspuasa.bangun_ruang.Tabung;

public class BangunRuangFragment extends Fragment {

    ImageView balokButton;
    ImageView kerucutButton;
    ImageView limasButton;
    ImageView tabungButton;
    ImageView kubusButton;
    ImageView bolaButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);

        balokButton = view.findViewById(R.id.balok);
        kerucutButton = view.findViewById(R.id.kerucut);
        limasButton = view.findViewById(R.id.limas);
        tabungButton = view.findViewById(R.id.tabung);
        kubusButton = view.findViewById(R.id.kubus);
        bolaButton = view.findViewById(R.id.bola);

        balokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Balok.class);
                startActivity(intent);
            }
        });

        kerucutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kerucut.class);
                startActivity(intent);
            }
        });

        limasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Limas.class);
                startActivity(intent);
            }
        });

        tabungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tabung.class);
                startActivity(intent);
            }
        });

        kubusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kubus.class);
                startActivity(intent);
            }
        });

        bolaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Bola.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
