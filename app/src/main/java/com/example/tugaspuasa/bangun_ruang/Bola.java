package com.example.tugaspuasa.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class Bola extends AppCompatActivity {

    private EditText inputJarijari;
    private ImageView btnHasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        inputJarijari = findViewById(R.id.inputJarijari);
        btnHasil = findViewById(R.id.btn_hasil);
        hasil = findViewById(R.id.total);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolume();
            }
        });
    }

    private void hitungVolume() {
        // Mengambil nilai jari-jari dari input
        String jarijariStr = inputJarijari.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jarijariStr.isEmpty()) {
            // Parsing nilai jari-jari ke tipe data double
            double jarijari = Double.parseDouble(jarijariStr);

            // Menghitung volume bola
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(jarijari, 3);

            // Menampilkan hasil volume
            hasil.setText(String.format("%.2f", volume));
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasil.setText("Masukkan jari-jari");
        }
    }
}