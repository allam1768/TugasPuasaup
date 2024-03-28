package com.example.tugaspuasa.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class Kubus extends AppCompatActivity {


    private EditText inputSisi;
    private ImageView btnHasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        inputSisi = findViewById(R.id.inputSisi);
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
        // Mengambil nilai panjang sisi dari input
        String sisiStr = inputSisi.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!sisiStr.isEmpty()) {
            // Parsing nilai panjang sisi ke tipe data double
            double sisi = Double.parseDouble(sisiStr);

            // Menghitung volume kubus
            double volume = Math.pow(sisi, 3);

            // Menampilkan hasil volume
            hasil.setText(String.format("%.2f", volume));
        } else {
            // Jika input kosong, tampilkan pesan kesalahan
            hasil.setText("Masukkan panjang sisi");
        }
    }
}