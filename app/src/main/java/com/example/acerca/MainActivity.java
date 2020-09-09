package com.example.acerca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAcercade(View view) {
        Intent nuevaActividad = new Intent(this, Acerca.class);
        startActivity(nuevaActividad);
    }
}