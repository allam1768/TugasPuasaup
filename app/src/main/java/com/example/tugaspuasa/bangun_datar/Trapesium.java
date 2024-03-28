package com.example.tugaspuasa.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tugaspuasa.R;

public class Trapesium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        final EditText sisiAtasEditText = findViewById(R.id.inputPanjangAtas);
        final EditText tinggiEditText = findViewById(R.id.inputTinggi);
        final EditText sisiBawahEditText = findViewById(R.id.inputPanjangBawah);
        final TextView hasilTextView = findViewById(R.id.txthasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiAtasString = sisiAtasEditText.getText().toString();
                String tinggiString = tinggiEditText.getText().toString();
                String sisiBawahString = sisiBawahEditText.getText().toString();

                if (!sisiAtasString.isEmpty() && !tinggiString.isEmpty() && !sisiBawahString.isEmpty()) {
                    double sisiAtas = Double.parseDouble(sisiAtasString);
                    double tinggi = Double.parseDouble(tinggiString);
                    double sisiBawah = Double.parseDouble(sisiBawahString);

                    double luas = hitungLuasTrapesium(sisiAtas, tinggi, sisiBawah);
                    hasilTextView.setText("Luas Trapesium: " + luas);
                } else {
                    hasilTextView.setText("Masukkan panjang sisi atas, tinggi, dan sisi bawah");
                }
            }
        });
    }

    private double hitungLuasTrapesium(double sisiAtas, double tinggi, double sisiBawah) {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
}
