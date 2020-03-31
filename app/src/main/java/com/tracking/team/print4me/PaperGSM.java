package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaperGSM extends AppCompatActivity {

    Button btn80,btn120,btn300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_gsm);

        btn80 = findViewById(R.id.btn80);
        btn120 = findViewById(R.id.btn120);
        btn300 = findViewById(R.id.btn300);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        btn80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperGSM = "80";
                Intent i = new Intent(PaperGSM.this,Banding.class);
                startActivity(i);
            }
        });

        btn120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperGSM = "120";
                Intent i = new Intent(PaperGSM.this,Banding.class);
                startActivity(i);
            }
        });

        btn300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.paperGSM = "300";
                Intent i = new Intent(PaperGSM.this,Banding.class);
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
