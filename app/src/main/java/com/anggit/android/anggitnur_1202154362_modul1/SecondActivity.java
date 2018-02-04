package com.anggit.android.anggitnur_1202154362_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String tempat;
        String menu;
        String porsi;

            tempat = getIntent().getExtras().getString("tempat");
            menu = getIntent().getExtras().getString("menu");
            porsi = getIntent().getExtras().getString("porsi");

            int totalPorsi = Integer.parseInt(porsi);
            Intent intenta = getIntent();
            String punyaduit = intenta.getStringExtra("punyaduit");
            int duit = Integer.parseInt(punyaduit);

            if (tempat.contains("Eatbus")) {
                int harga = 50000;
                int totalHarga = harga * totalPorsi;

                if (duit >= totalHarga) {
                    TextView viewMakan = findViewById(R.id.textViewTempat);
                    viewMakan.setText(tempat);

                    TextView viewMenu = findViewById(R.id.textViewMenu);
                    viewMenu.setText(menu);

                    TextView viewPorsi = findViewById(R.id.textViewPorsi);
                    viewPorsi.setText(porsi);

                    String hasil = String.valueOf(totalHarga);
                    TextView viewHarga = findViewById(R.id.textViewHarga);
                    viewHarga.setText(hasil);

                    Toast.makeText(this, "Udah sini aja makannya", Toast.LENGTH_LONG).show();
                } else {
                    TextView viewMakan = findViewById(R.id.textViewTempat);
                    viewMakan.setText(tempat);

                    TextView viewMenu = findViewById(R.id.textViewMenu);
                    viewMenu.setText(menu);

                    TextView viewPorsi = findViewById(R.id.textViewPorsi);
                    viewPorsi.setText(porsi);

                    String hasil = String.valueOf(totalHarga);
                    TextView viewHarga = findViewById(R.id.textViewHarga);
                    viewHarga.setText(hasil);
                    Toast.makeText(this, "Jangan disini deh, gak cukup uang nyaa", Toast.LENGTH_LONG).show();
                }

            } else {
                int harga = 30000;
                int totalHarga = harga * totalPorsi;
                if (duit >= totalHarga) {
                    TextView viewMakan = findViewById(R.id.textViewTempat);
                    viewMakan.setText(tempat);

                    TextView viewMenu = findViewById(R.id.textViewMenu);
                    viewMenu.setText(menu);

                    TextView viewPorsi = findViewById(R.id.textViewPorsi);
                    viewPorsi.setText(porsi);

                    String hasil = String.valueOf(totalHarga);
                    TextView tvHarga = findViewById(R.id.textViewHarga);
                    tvHarga.setText(hasil);

                    Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();
                } else {
                    TextView tvMakan = findViewById(R.id.textViewTempat);
                    tvMakan.setText(tempat);

                    TextView tvMenu = findViewById(R.id.textViewMenu);
                    tvMenu.setText(menu);

                    TextView tvPorsi = findViewById(R.id.textViewPorsi);
                    tvPorsi.setText(porsi);

                    String hasil = String.valueOf(totalHarga);
                    TextView viewHarga = findViewById(R.id.textViewHarga);
                    viewHarga.setText(hasil);

                    Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
                }
            }
        }
    }



