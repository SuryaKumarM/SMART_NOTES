package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ccycle extends AppCompatActivity {
private Button c1;
String url="https://drive.google.com/open?id=0B0UE2cO8K77xN2VRbmg3ZjdCenFTVEdNS0w0Y0lVRFBtUUFJ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccycle);
        c1=findViewById(R.id.cc1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
