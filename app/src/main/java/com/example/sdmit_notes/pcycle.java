package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pcycle extends AppCompatActivity {
private Button p1;
private Button p2;
private Button p3;
private Button p4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcycle);
        p1=findViewById(R.id.phy1);
        p2=findViewById(R.id.phy2);
        p3=findViewById(R.id.phy3);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(pcycle.this, module.class);
                i.putExtra("key","physics");
                startActivity(i);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(pcycle.this, module.class);
                i.putExtra("key","electrical");
                startActivity(i);
            }
        });
    }
}
