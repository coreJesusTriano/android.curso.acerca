package com.example.acerca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
    }

    public void volver(View view){
/*        Intent actividadPrincipal = new Intent(this, MainActivity.class);
        startActivity(actividadPrincipal);*/
        finish();
    }
}