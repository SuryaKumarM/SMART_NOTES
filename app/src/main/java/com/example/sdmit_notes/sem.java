package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sem extends AppCompatActivity {
    private Button s1,s2,s3,s4,s5,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);
        s1 = findViewById(R.id.sem3);
        s2 = findViewById(R.id.sem4);
        s3 = findViewById(R.id.sem5);
        s4 = findViewById(R.id.sem6);
        s5 = findViewById(R.id.sem7);
        s6 = findViewById(R.id.sem8);
        String value = getIntent().getStringExtra("sem");
        switch (value) {
            case "CSE":
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(sem.this, third.class);
                        i1.putExtra("branch", "cse");
                        startActivity(i1);
                    }
                });
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(sem.this, forth.class);
                        i2.putExtra("branch", "cse");
                        startActivity(i2);
                    }
                });
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(sem.this, fifth.class);
                        i3.putExtra("branch", "cse");
                        startActivity(i3);
                    }
                });
                s4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i4 = new Intent(sem.this, sixth.class);
                        i4.putExtra("branch", "cse");
                        startActivity(i4);
                    }
                });
                s5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i5 = new Intent(sem.this, seventh.class);
                        i5.putExtra("branch", "cse");
                        startActivity(i5);
                    }
                });
                s6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i6 = new Intent(sem.this, eigth.class);
                        i6.putExtra("branch", "cse");
                        startActivity(i6);
                    }
                });
                break;
            case "MECH":
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(sem.this, third.class);
                        i1.putExtra("branch", "mech");
                        startActivity(i1);
                    }
                });
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(sem.this, forth.class);
                        i2.putExtra("branch", "mech");
                        startActivity(i2);
                    }
                });
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(sem.this, fifth.class);
                        i3.putExtra("branch", "mech");
                        startActivity(i3);
                    }
                });
                s4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i4 = new Intent(sem.this, sixth.class);
                        i4.putExtra("branch", "mech");
                        startActivity(i4);
                    }
                });
                s5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i5 = new Intent(sem.this, seventh.class);
                        i5.putExtra("branch", "mech");
                        startActivity(i5);
                    }
                });
                s6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i6 = new Intent(sem.this, eigth.class);
                        i6.putExtra("branch", "mech");
                        startActivity(i6);
                    }
                });
                break;
            case "ISE":
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(sem.this, third.class);
                        i1.putExtra("branch", "ise");
                        startActivity(i1);
                    }
                });
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(sem.this, forth.class);
                        i2.putExtra("branch", "ise");
                        startActivity(i2);
                    }
                });
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(sem.this, fifth.class);
                        i3.putExtra("branch", "ise");
                        startActivity(i3);
                    }
                });
                s4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i4 = new Intent(sem.this, sixth.class);
                        i4.putExtra("branch", "ise");
                        startActivity(i4);
                    }
                });
                s5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i5 = new Intent(sem.this, seventh.class);
                        i5.putExtra("branch", "ise");
                        startActivity(i5);
                    }
                });
                s6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i6 = new Intent(sem.this, eigth.class);
                        i6.putExtra("branch", "ise");
                        startActivity(i6);
                    }
                });
                break;
            case "CIVIL":
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(sem.this, third.class);
                        i1.putExtra("branch", "civil");
                        startActivity(i1);
                    }
                });
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(sem.this, forth.class);
                        i2.putExtra("branch", "civil");
                        startActivity(i2);
                    }
                });
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(sem.this, fifth.class);
                        i3.putExtra("branch", "civil");
                        startActivity(i3);
                    }
                });
                s4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i4 = new Intent(sem.this, sixth.class);
                        i4.putExtra("branch", "civil");
                        startActivity(i4);
                    }
                });
                s5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i5 = new Intent(sem.this, seventh.class);
                        i5.putExtra("branch", "civil");
                        startActivity(i5);
                    }
                });
                s6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i6 = new Intent(sem.this, eigth.class);
                        i6.putExtra("branch", "civil");
                        startActivity(i6);
                    }
                });
                break;
            case "ECE":
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(sem.this, third.class);
                        i1.putExtra("branch", "ece");
                        startActivity(i1);
                    }
                });
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(sem.this, forth.class);
                        i2.putExtra("branch", "ece");
                        startActivity(i2);
                    }
                });
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(sem.this, fifth.class);
                        i3.putExtra("branch", "ece");
                        startActivity(i3);
                    }
                });
                s4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i4 = new Intent(sem.this, sixth.class);
                        i4.putExtra("branch", "ece");
                        startActivity(i4);
                    }
                });
                s5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i5 = new Intent(sem.this, seventh.class);
                        i5.putExtra("branch", "ece");
                        startActivity(i5);
                    }
                });
                s6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i6 = new Intent(sem.this, eigth.class);
                        i6.putExtra("branch", "ece");
                        startActivity(i6);
                    }
                });
                break;
            case "EEE":
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i1 = new Intent(sem.this, third.class);
                        i1.putExtra("branch", "eee");
                        startActivity(i1);
                    }
                });
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i2 = new Intent(sem.this, forth.class);
                        i2.putExtra("branch", "eee");
                        startActivity(i2);
                    }
                });
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i3 = new Intent(sem.this, fifth.class);
                        i3.putExtra("branch", "eee");
                        startActivity(i3);
                    }
                });
                s4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i4 = new Intent(sem.this, sixth.class);
                        i4.putExtra("branch", "eee");
                        startActivity(i4);
                    }
                });
                s5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i5 = new Intent(sem.this, seventh.class);
                        i5.putExtra("branch", "eee");
                        startActivity(i5);
                    }
                });
                s6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i6 = new Intent(sem.this, eigth.class);
                        i6.putExtra("branch", "eee");
                        startActivity(i6);
                    }
                });
                break;
        }
    }
}
