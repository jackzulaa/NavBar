package com.mokoth.navbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    fragment_first firstFragment = new fragment_first();
    fragment_second secondFragment = new fragment_second();
    fragment_third thirdFragment = new fragment_third();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.person:
                                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();
                                return true;

                            case R.id.home:
                                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, secondFragment).commit();
                                return true;

                            case R.id.settings:
                                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, thirdFragment).commit();
                                return true;
                        }
                        return false;
                    }
                });
        bottomNavigationView.setSelectedItemId(R.id.person);
    }



}