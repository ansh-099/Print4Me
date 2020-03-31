package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageNumber extends AppCompatActivity {

    EditText etPageNumber;
    Button btnPNdone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_number);

        etPageNumber = findViewById(R.id.etPageNumber);
        btnPNdone = findViewById(R.id.btnPNdone);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnPNdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etPageNumber.getText().toString().equals("")){

                    Toast.makeText(PageNumber.this, "Please Enter Some Value", Toast.LENGTH_SHORT).show();

                }else {
                    Values.obj.paperNumber = Integer.valueOf(etPageNumber.getText().toString());
                    Intent i = new Intent(PageNumber.this, TotalPrice.class);
                    startActivity(i);
                }
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
