package com.example.tugaspuasa.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tugaspuasa.R;

import java.text.DecimalFormat;

public class Kerucut extends AppCompatActivity {



    private EditText inputJariJari, inputTinggi;
    private ImageView btnHasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        inputJariJari = findViewById(R.id.inputJarijari);
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
        String jariJariStr = inputJariJari.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jariJariStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Parsing nilai jari-jari dan tinggi ke tipe data double
            double jariJari = Double.parseDouble(jariJariStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung volume kerucut
            double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;

            // Menampilkan hasil volume
            hasil.setText(String.format("%.2f", volume));
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasil.setText("Masukkan jari-jari dan tinggi");
        }
    }
}