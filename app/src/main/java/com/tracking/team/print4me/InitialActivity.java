package com.tracking.team.print4me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class InitialActivity extends AppCompatActivity {

    Handler h;
    Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        getSupportActionBar().hide();


        h = new Handler();
        r = new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(InitialActivity.this,MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.anim_enter,
                        R.anim.anim_leave);
                finish();

            }
        };


        h.postDelayed(r,300);
    }
}
