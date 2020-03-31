package com.tracking.team.print4me;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.Random;

public class UploadPDF extends AppCompatActivity {

    Button btnUploadPDF;
    ProgressDialog loading;

    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_pdf);

        btnUploadPDF = findViewById(R.id.btnUploadPDF);


        btnUploadPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OpenGallery();

                loading = new ProgressDialog(UploadPDF.this);
                loading.setTitle("Uploading Licence");
                loading.setMessage("Please Wait");
                loading.setCancelable(false);
                loading.show();
            }
        });

    }

    void OpenGallery()
    {

        Intent i= new Intent();
        i.setAction(Intent.ACTION_GET_CONTENT);
        i.setType("*/*");
        startActivityForResult(i, 101);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (data != null) {

            imageUri = data.getData();

            final String random = String.valueOf(new Random().nextInt(10000000));



            StorageReference riversRef = FirebaseStorage.getInstance().getReference().child("doc"+random);
            UploadTask uploadTask = riversRef.putFile(imageUri);

            // Register observers to listen for when the download is done or if it fails
            uploadTask.addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
                    // Handle unsuccessful uploads
                    if (loading.isShowing()) {
                        loading.dismiss();
                    }
                }
            }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    // taskSnapshot.getMetadata() contains file metadata such as size, content-type, and download URL.

                    FirebaseStorage.getInstance().getReference().child("doc"+random).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            // Got the download URL for 'users/me/profile.png'
                            String downloadUrl = String.valueOf(uri);


                            Log.d("heyy", downloadUrl);

                            if (loading.isShowing()) {
                                loading.dismiss();
                            }


                            Values.obj.PDFurl = downloadUrl;
                            Intent i = new Intent(UploadPDF.this,MoreDetails.class);
                            startActivity(i);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {

                            // Handle any errors
                            if (loading.isShowing()) {
                                loading.dismiss();
                            }
                        }
                    });


                }
            });


        }


    }
}
