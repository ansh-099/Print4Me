package com.tracking.team.print4me;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DecimalFormat;

public class TotalPrice extends AppCompatActivity {

    Button btnTPdone;
    TextView tvAmount;
    Double totalAmt = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_price);

        btnTPdone = findViewById(R.id.btnTPdone);
        tvAmount = findViewById(R.id.tvAmount);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btnTPdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TotalPrice.this, "Please Wait", Toast.LENGTH_SHORT).show();

            }
        });

        FirebaseDatabase.getInstance().getReference().child("Costing").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    Costing cost = dataSnapshot.getValue(Costing.class);


                    if(Values.obj.paperSize.equals("A4")){
                        totalAmt = totalAmt + cost.sizeA4 * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperSize.equals("A3")){
                        totalAmt = totalAmt + cost.sizeA3 * Values.obj.paperNumber;
                    }

                    if(Values.obj.printType.equals("Colored")){
                        totalAmt = totalAmt + cost.colored * Values.obj.paperNumber;
                    }

                    if(Values.obj.printType.equals("Single Color")){
                        totalAmt = totalAmt + cost.colorBlack * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperGSM.equals("80")){
                        totalAmt = totalAmt + cost.gsm80 * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperGSM.equals("120")){
                        totalAmt = totalAmt + cost.gsm120 * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperGSM.equals("300")){
                        totalAmt = totalAmt + cost.gsm300 * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperType.equals("Glossy")){
                        totalAmt = totalAmt + cost.papertypeGlossy * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperType.equals("Matt")){
                        totalAmt = totalAmt + cost.papertypeMatt * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperType.equals("Sticker")){
                        totalAmt = totalAmt + cost.papertypeSticker * Values.obj.paperNumber;
                    }

                    if(Values.obj.paperType.equals("Double Sided")){
                        totalAmt = totalAmt + cost.papertypeDoubleSided * Values.obj.paperNumber;
                    }

                    if(Values.obj.banding.equals("Staple")){
                        totalAmt = totalAmt + cost.bandingStaple * Values.obj.paperNumber;
                    }

                    if(Values.obj.banding.equals("Wire")){
                        totalAmt = totalAmt + cost.bandingWire * Values.obj.paperNumber;
                    }

                    if(Values.obj.banding.equals("None")){
                        totalAmt = totalAmt + cost.bandingNone * Values.obj.paperNumber;
                    }


                    DecimalFormat f = new DecimalFormat("##.00");
                    totalAmt = Double.valueOf(f.format(totalAmt));

                    tvAmount.setText(totalAmt.toString());
                    Values.obj.totalPrice = totalAmt;



                    btnTPdone.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent(TotalPrice.this,UploadPDF.class);
                            startActivity(i);
                        }
                    });

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
