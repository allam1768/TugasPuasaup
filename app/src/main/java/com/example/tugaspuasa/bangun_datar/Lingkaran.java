package com.example.tugaspuasa.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class Lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        final EditText jariJariEditText = findViewById(R.id.inputJarijari);
        final TextView hasilTextView = findViewById(R.id.txthasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariString = jariJariEditText.getText().toString();

                if (!jariJariString.isEmpty()) {
                    double jariJari = Double.parseDouble(jariJariString);

                    double luas = hitungLuasLingkaran(jariJari);
                    String formattedLuas = String.format("%.5f", luas);
                    hasilTextView.setText("Luas Lingkaran: " + formattedLuas);
                } else {
                    hasilTextView.setText("Masukkan jari-jari");
                }
            }
        });
    }

    private double hitungLuasLingkaran(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }
}
