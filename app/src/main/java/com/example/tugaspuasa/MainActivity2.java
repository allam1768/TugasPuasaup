package com.example.tugaspuasa;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugaspuasa.fragment.BangunDatarFragment;
import com.example.tugaspuasa.fragment.BangunRuangFragment;
import com.example.tugaspuasa.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomNavigationView = findViewById(R.id.BottomNavigationView2);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout2, new BangunRuangFragment())
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.Datar) {
                        selectedFragment = new BangunDatarFragment();
                    } else if (item.getItemId() == R.id.Ruang) {
                        selectedFragment = new BangunRuangFragment();
                    } else if (item.getItemId() == R.id.Profile) {
                        selectedFragment = new ProfileFragment();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_layout2, selectedFragment)
                            .commit();

                    return true;
                }
            };
}
