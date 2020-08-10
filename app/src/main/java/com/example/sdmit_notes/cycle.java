package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cycle extends AppCompatActivity {
private Button c1;
private Button p1;
private Button m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
        c1=findViewById(R.id.cbutton);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(cycle.this,ccycle.class);
                startActivity(i1);
            }
        });
        p1=findViewById(R.id.pbutton);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(cycle.this,pcycle.class);
                startActivity(i2);
            }
        });
        m1=findViewById(R.id.mbutton);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(cycle.this,mcycle.class);
                startActivity(i3);
            }
        });
    }
}
