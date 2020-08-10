package com.example.sdmit_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class third extends AppCompatActivity {
private Button b1,b6,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=findViewById(R.id.cse31);
        b2=findViewById(R.id.cse32);
        b3=findViewById(R.id.cse33);
        b4=findViewById(R.id.cse34);
        b5=findViewById(R.id.cse35);
        b6=findViewById(R.id.cse36);
        String value=getIntent().getStringExtra("branch");
        if("cse".equals(value)){
            b1.setText("ADE");
            b2.setText("CO");
            b3.setText("DMS");
            b4.setText("DSA");
            b5.setText("SE");
            b6.setText("M3");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","ade");
                    startActivity(i1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","co");
                    startActivity(i1);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dms");
                    startActivity(i1);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dsa");
                    startActivity(i1);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","se");
                    startActivity(i1);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","m3");
                    startActivity(i1);
                }
            });
        }
        else if("mech".equals(value))
        {
            b1.setText("ADE");
            b2.setText("CO");
            b3.setText("DMS");
            b4.setText("DSA");
            b5.setText("SE");
            b6.setText("M3");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","ade");
                    startActivity(i1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","co");
                    startActivity(i1);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dms");
                    startActivity(i1);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dsa");
                    startActivity(i1);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","se");
                    startActivity(i1);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","m3");
                    startActivity(i1);
                }
            });
        }
        else if("ise".equals(value))
        {
            b1.setText("ADE");
            b2.setText("CO");
            b3.setText("DMS");
            b4.setText("DSA");
            b5.setText("SE");
            b6.setText("M3");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","ade");
                    startActivity(i1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","co");
                    startActivity(i1);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dms");
                    startActivity(i1);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dsa");
                    startActivity(i1);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","se");
                    startActivity(i1);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","m3");
                    startActivity(i1);
                }
            });
        }
        else if("civil".equals(value))
        {
            b1.setText("SOM");
            b2.setText("BMC");
            b3.setText("FM");
            b4.setText("GEOLOGY");
            b5.setText("SURVEY");
            b6.setText("M3");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","som");
                    startActivity(i1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","bmc");
                    startActivity(i1);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","fm");
                    startActivity(i1);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","geology");
                    startActivity(i1);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","survey");
                    startActivity(i1);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","m3");
                    startActivity(i1);
                }
            });
        }
        else if("ece".equals(value))
        {
            b1.setText("DSD");
            b2.setText("CO");
            b3.setText("ED");
            b4.setText("P&I");
            b5.setText("NT");
            b6.setText("M3");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dsd");
                    startActivity(i1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","co");
                    startActivity(i1);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","ed");
                    startActivity(i1);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","p&i");
                    startActivity(i1);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","nt");
                    startActivity(i1);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","m3");
                    startActivity(i1);
                }
            });
        }
        else if("eee".equals(value))
        {
            b1.setText("AEC");
            b2.setText("DSD");
            b3.setText("ECA");
            b4.setText("EEM");
            b5.setText("T&G");
            b6.setText("M3");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","aec");
                    startActivity(i1);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","dsd");
                    startActivity(i1);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","eca");
                    startActivity(i1);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","eem");
                    startActivity(i1);
                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","t&g");
                    startActivity(i1);
                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i1=new Intent(third.this,module.class);
                    i1.putExtra("key","m3");
                    startActivity(i1);
                }
            });
        }
        else{
            Intent i2=new Intent(third.this,sem.class);
            startActivity(i2);
        }
    }
}
