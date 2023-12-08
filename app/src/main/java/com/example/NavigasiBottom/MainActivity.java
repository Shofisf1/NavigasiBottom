package com.example.NavigasiBottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {
    private BottomNavigationView bottomNavigationView;
    private FragmentBuku fragmentBuku = new FragmentBuku();
    private FragmentMusik fragmentMusik = new FragmentMusik();
    private FragmentFilm fragmentFilm = new FragmentFilm();
    private FragmentVidio fragmentVidio = new FragmentVidio();
    private FragmentFoto fragmentFoto = new FragmentFoto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomview);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_buku:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragmentBuku).commit();
                return true;
            case R.id.menu_musik:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragmentMusik).commit();
                return true;
            case R.id.menu_film:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragmentFilm).commit();
                return true;
            case R.id.menu_vidio:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragmentVidio).commit();
                return true;
            case R.id.menu_foto:
                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragmentFoto).commit();
                return true;
        }
        return false;
    }
}