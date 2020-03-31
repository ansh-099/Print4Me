package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Banding extends AppCompatActivity {

    Button btnStaple,btnWire,btnNone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banding);

        btnStaple = findViewById(R.id.btnStaple);
        btnWire = findViewById(R.id.btnWire);
        btnNone = findViewById(R.id.btnNone);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnStaple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.banding = "Staple";
                Intent i = new Intent(Banding.this,PageNumber.class);
                startActivity(i);
            }
        });

        btnWire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.banding = "Wire";
                Intent i = new Intent(Banding.this,PageNumber.class);
                startActivity(i);
            }
        });

        btnNone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.banding = "None";
                Intent i = new Intent(Banding.this,PageNumber.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
