package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class branch extends AppCompatActivity {
private Button b1;
private Button b2;
private Button b3;
private Button b4;
private Button b5;
private Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        b1=findViewById(R.id.branch1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(branch.this,sem.class);
                i1.putExtra("sem","CSE");
                startActivity(i1);
            }
        });
        b2=findViewById(R.id.branch2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(branch.this,sem.class);
                i2.putExtra("sem","MECH");
                startActivity(i2);
            }
        });
        b3=findViewById(R.id.branch3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(branch.this,sem.class);
                i3.putExtra("sem","ISE");
                startActivity(i3);
            }
        });
        b4=findViewById(R.id.branch4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(branch.this,sem.class);
                i4.putExtra("sem","CIVIL");
                startActivity(i4);
            }
        });
        b5=findViewById(R.id.branch5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(branch.this,sem.class);
                i5.putExtra("sem","ECE");
                startActivity(i5);
            }
        });
        b6=findViewById(R.id.branch6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(branch.this,sem.class);
                i6.putExtra("sem","EEE");
                startActivity(i6);
            }
        });
    }
}
