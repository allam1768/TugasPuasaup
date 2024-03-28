package com.example.tugaspuasa.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tugaspuasa.R;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alasEditText = findViewById(R.id.inputPanjang);
        final EditText tinggiEditText = findViewById(R.id.inputTinggi);
        final TextView hasilTextView = findViewById(R.id.txthasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasString = alasEditText.getText().toString();
                String tinggiString = tinggiEditText.getText().toString();

                if (!alasString.isEmpty() && !tinggiString.isEmpty()) {
                    double alas = Double.parseDouble(alasString);
                    double tinggi = Double.parseDouble(tinggiString);

                    double luas = hitungLuasSegitiga(alas, tinggi);
                    hasilTextView.setText("Luas Segitiga: " + luas);
                } else {
                    hasilTextView.setText("Masukkan panjang alas dan tinggi");
                }
            }
        });
    }

    private double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}
