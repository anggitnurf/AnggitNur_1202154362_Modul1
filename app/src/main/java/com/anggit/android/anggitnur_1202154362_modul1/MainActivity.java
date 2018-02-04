package com.anggit.android.anggitnur_1202154362_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editMenu, editPorsi;
    TextView viewTempat, viewMenu, viewPorsi, viewHarga;
    Button Eatbus, Apnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editMenu = (EditText)findViewById(R.id.editTextMenu);
        editPorsi =(EditText) findViewById(R.id.editTextPorsi);
        viewTempat = (TextView) findViewById(R.id.textViewTempat);
        viewMenu = (TextView)findViewById(R.id.textViewMenu);
        viewPorsi = (TextView)findViewById(R.id.textViewPorsi);
        viewHarga = (TextView)findViewById(R.id.textViewHarga);
        Eatbus = (Button) findViewById(R.id.buttonEatbus);
        Apnormal = (Button) findViewById(R.id.buttonApnormal);

    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int duit = 65000;

        String punyaduit = String.valueOf(duit);
        String tempat = "Eatbus";
        String menu = editMenu.getText().toString();
        String porsi = editPorsi.getText().toString();

        intent.putExtra("punyaduit", punyaduit);
        intent.putExtra("tempat", tempat);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);

        startActivity(intent);

    }

    public void Apnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int duit = 65000;

        String punyaduit = String.valueOf(duit);
        String tempat = "Apnormal";
        String menu = editMenu.getText().toString();
        String porsi = editPorsi.getText().toString();

        intent.putExtra("punyaduit", punyaduit);
        intent.putExtra("tempat", tempat);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);

        startActivity(intent);
    }
}
