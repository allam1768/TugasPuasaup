package com.example.tugaspuasa.bangun_datar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class segiempat extends AppCompatActivity {

    private EditText editText;
    private TextView textViewResult;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segiempat);

        editText = findViewById(R.id.inputSisi);
        textViewResult = findViewById(R.id.txthasil);
        buttonCalculate = findViewById(R.id.btn_hasil);

        buttonCalculate.setOnClickListener(v -> hitungLuasPersegi());
    }

    private void hitungLuasPersegi() {
        String panjangSisiStr = editText.getText().toString();
        int panjangSisi;
        try {
            panjangSisi = Integer.parseInt(panjangSisiStr); // Mengubah dari int.parseInt menjadi Integer.parseInt
            int luas = panjangSisi * panjangSisi; // Menggunakan tipe data int
            textViewResult.setText("Luas Persegi: " + luas);
        } catch (NumberFormatException e) {
            textViewResult.setText("Masukkan panjang sisi dengan benar");
        }
    }
}