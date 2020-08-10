package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class module extends AppCompatActivity {
    private TextView t1;
private Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.m1);
        b2=findViewById(R.id.m2);
        b3=findViewById(R.id.m3);
        b4=findViewById(R.id.m4);
        b5=findViewById(R.id.m5);
        String value=getIntent().getStringExtra("key");
        if("physics".equals(value))
        {
            t1.setText(value);
            final String module1="https://drive.google.com/open?id=0B0UE2cO8K77xN2VRbmg3ZjdCenFTVEdNS0w0Y0lVRFBtUUFJ";
            final String module2="https://drive.google.com/open?id=1PRSB_F0fHg9-zlEjv6DLo5fe3Bssc1GX";
            final String module3="";
            final String module4="";
            final String module5="";
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module1));
                    startActivity(i);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module2));
                    startActivity(i);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module3));
                    startActivity(i);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module4));
                    startActivity(i);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module5));
                    startActivity(i);
                }
            });
        }
        else if("electrical".equals(value)){
            t1.setText(value);
            final String module1="https://drive.google.com/open?id=1XwszctQtsZIMltT-g5zia4PGHgXOx7Uv";
            final String module2="https://drive.google.com/open?id=1pfJM-zUFPYeBrfreW5k-wvz6pkpRMFbo";
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module1));
                    startActivity(i);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module2));
                    startActivity(i);
                }
            });
        }
        if("ade".equals(value))
        {
            t1.setText(value);
            final String module1="https://drive.google.com/open?id=0B0UE2cO8K77xN2VRbmg3ZjdCenFTVEdNS0w0Y0lVRFBtUUFJ";
            final String module2="https://drive.google.com/open?id=1PRSB_F0fHg9-zlEjv6DLo5fe3Bssc1GX";
            final String module3="";
            final String module4="";
            final String module5="";
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module1));
                    startActivity(i);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module2));
                    startActivity(i);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module3));
                    startActivity(i);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module4));
                    startActivity(i);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(module5));
                    startActivity(i);
                }
            });
        }
    }
}
