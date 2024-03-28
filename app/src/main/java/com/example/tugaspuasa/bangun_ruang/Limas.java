package com.example.tugaspuasa.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class Limas extends AppCompatActivity {


    private EditText inputJarijari, inputTinggi;
    private ImageView btnHasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        inputJarijari = findViewById(R.id.inputJarijari);
        inputTinggi = findViewById(R.id.inputTinggi);
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
        // Mengambil nilai jari-jari dan tinggi dari input
        String jarijariStr = inputJarijari.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jarijariStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Parsing nilai jari-jari dan tinggi ke tipe data double
            double jarijari = Double.parseDouble(jarijariStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung volume limas
            double volume = (1.0 / 3.0) * Math.PI * Math.pow(jarijari, 2) * tinggi;

            // Menampilkan hasil volume
            hasil.setText(String.format("%.2f", volume));
        } else {
            // Jika salah satu input kosong, tampilkan pesan kesalahan
            hasil.setText("Masukkan jari-jari dan tinggi");
        }
    }
}