package com.example.tugaspuasa.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class Balok extends AppCompatActivity {

    private EditText inputPanjang, inputLebar, inputTinggi;
    private ImageView btnHasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        inputPanjang = findViewById(R.id.inputPanjang);
        inputLebar = findViewById(R.id.inputLebar);
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
        // Mengambil nilai panjang, lebar, dan tinggi dari input
        String panjangStr = inputPanjang.getText().toString().trim();
        String lebarStr = inputLebar.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
            // Parsing nilai panjang, lebar, dan tinggi ke tipe data double
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double tinggi = Double.parseDouble(tinggiStr);

            // Menghitung volume balok
            double volume = panjang * lebar * tinggi;

            // Menampilkan hasil volume
            hasil.setText(String.format("%.2f", volume));
        } else {
            // Jika salah satu input kosong, tampilkan pesan kesalahan
            hasil.setText("Masukkan panjang, lebar, dan tinggi");
        }
    }
}