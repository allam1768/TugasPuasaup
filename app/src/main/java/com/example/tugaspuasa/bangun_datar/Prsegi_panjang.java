package com.example.tugaspuasa.bangun_datar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugaspuasa.R;

public class Prsegi_panjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prsegi_panjang);

        final EditText panjangEditText = findViewById(R.id.inputPanjang);
        final EditText lebarEditText = findViewById(R.id.inputLebar);
        final TextView hasilTextView = findViewById(R.id.txthasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangString = panjangEditText.getText().toString();
                String lebarString = lebarEditText.getText().toString();

                if (!panjangString.isEmpty() && !lebarString.isEmpty()) {
                    int panjang = Integer.parseInt(panjangString);
                    int lebar = Integer.parseInt(lebarString);

                    int luas = hitungLuasPersegiPanjang(panjang, lebar);
                    hasilTextView.setText("Luas Persegi Panjang: " + luas);
                } else {
                    hasilTextView.setText("Masukkan panjang dan lebar");
                }
            }
        });
    }

    private int hitungLuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }
}