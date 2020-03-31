package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pay extends AppCompatActivity {

    Button btnOnDelivery,btnInAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        btnOnDelivery = findViewById(R.id.btnOnDelivery);
        btnInAccount = findViewById(R.id.btnInAccount);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnOnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.pay = "On Delivery";
                Intent i = new Intent(Pay.this, MoreDetails.class);
                startActivity(i);
            }
        });

        btnInAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.pay = "In Account";
                Intent i = new Intent(Pay.this, MoreDetails.class);
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
