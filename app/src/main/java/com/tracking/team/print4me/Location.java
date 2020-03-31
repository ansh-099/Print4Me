package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Location extends AppCompatActivity {

    Button btnLocdone;
    EditText etName,etLocation, etPhno, etEmailID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        btnLocdone = findViewById(R.id.btnLocdone);
        etLocation = findViewById(R.id.etLocation);
        etPhno = findViewById(R.id.etPhno);
        etEmailID = findViewById(R.id.etEmailID);
        etName = findViewById(R.id.etName);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnLocdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etName.getText().toString().equals("")||
                        etLocation.getText().toString().equals("") ||
                        etPhno.getText().toString().equals("") ||
                        etEmailID.getText().toString().equals("")){
                    Toast.makeText(Location.this, "Please Enter all Values correctly", Toast.LENGTH_SHORT).show();
                }else {


                    Values.obj.location = etLocation.getText().toString();
                    Values.obj.mobile = etPhno.getText().toString();
                    Values.obj.emailID = etEmailID.getText().toString();
                    Values.obj.name = etName.getText().toString();

                    Intent i = new Intent(Location.this, Pay.class);
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
