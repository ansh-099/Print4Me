package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaperSize extends AppCompatActivity {

    Button btnA4,btnA3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_size);

        btnA4 = findViewById(R.id.btnA4);
        btnA3 = findViewById(R.id.btnA3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        btnA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperSize = "A4";
                Intent i = new Intent(PaperSize.this,PaperGSM.class);
                startActivity(i);
            }
        });

        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperSize = "A3";
                Intent i = new Intent(PaperSize.this,PaperGSM.class);
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
