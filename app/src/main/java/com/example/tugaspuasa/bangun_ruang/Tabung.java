package com.example.tugaspuasa.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tugaspuasa.R;

public class Tabung extends AppCompatActivity {

    private EditText inputJarijari, inputTinggi;
    private ImageView btnHasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

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
        // Mengambil nilai jari-jari dari input
        String jarijariStr = inputJarijari.getText().toString().trim();
        // Mengambil nilai tinggi dari input
        String tinggiStr = inputTinggi.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jarijariStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Parsing nilai jari-jari dan tinggi ke tipe data double
            double jarijari = Double.parseDouble(jarijariStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung volume tabung
            double volume = Math.PI * Math.pow(jarijari, 2) * tinggi;

            // Menampilkan hasil volume
            hasil.setText(String.format("%.2f", volume));
        } else {
            // Jika salah satu input kosong, tampilkan pesan kesalahan
            hasil.setText("Masukkan jari-jari dan tinggi");
        }
    }
}