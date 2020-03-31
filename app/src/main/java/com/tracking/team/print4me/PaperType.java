package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaperType extends AppCompatActivity {
    Button btnGlossy,btnMatt,btnSticker,btnDoubleSided;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_type);

        btnGlossy = findViewById(R.id.btnGlossy);
        btnMatt = findViewById(R.id.btnMatt);
        btnSticker = findViewById(R.id.btnSticker);
        btnDoubleSided = findViewById(R.id.btnDoubleSided);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnGlossy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperType = "Glossy";
                Intent i = new Intent(PaperType.this,PaperSize.class);
                startActivity(i);
            }
        });

        btnMatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperType = "Matt";
                Intent i = new Intent(PaperType.this,PaperSize.class);
                startActivity(i);
            }
        });

        btnSticker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperType = "Sticker";
                Intent i = new Intent(PaperType.this,PaperSize.class);
                startActivity(i);
            }
        });

        btnDoubleSided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperType = "Double Sided";
                Intent i = new Intent(PaperType.this,PaperSize.class);
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
