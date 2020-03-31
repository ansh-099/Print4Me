package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class MoreDetails extends AppCompatActivity {

    EditText etMoreDetail;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);

        etMoreDetail = findViewById(R.id.etMoreDetail);
        btnSend = findViewById(R.id.btnSend);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Values.obj.moreDetails = etMoreDetail.getText().toString();
                Log.d("hey",Values.obj.paperType);

                Toast.makeText(MoreDetails.this, "Thanks!", Toast.LENGTH_SHORT).show();
                FirebaseDatabase.getInstance().getReference().child("Orders").push().setValue(Values.obj);
                Intent i = new Intent(MoreDetails.this, MainActivity.class);
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
