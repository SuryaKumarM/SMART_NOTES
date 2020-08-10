package com.example.sdmit_notes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
DrawerLayout drawerLayout;
Toolbar toolbar;
NavigationView navigationView;
ActionBarDrawerToggle toggle;
private TextView em;

    private Button b1;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button22);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,borc.class);
                in.putExtra("key"," SDMIT UJIRE");
                startActivity(in);
            }
        });
        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolbar);
        navigationView=findViewById(R.id.navigationview);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId())
        {
            case R.id.home:
Toast.makeText(MainActivity.this,"Wait",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.share:
                Intent i1=new Intent(Intent.ACTION_SEND);
                i1.setType("text/plain");
                String body="Click here to download the SDMIT NOTES app-";
                        String subject="The SDMIT NOTES App link below click to download the app";
                        i1.putExtra(Intent.EXTRA_TEXT,body);
                        i1.putExtra(Intent.EXTRA_SUBJECT,subject);
                        startActivity(Intent.createChooser(i1,"Share Using"));
                break;
            case R.id.contact:
                Intent i3=new Intent(MainActivity.this,contact.class);
                startActivity(i3);
                break;
            case R.id.about:
                Intent i4=new Intent(MainActivity.this,about.class);
                startActivity(i4);
                break;

        }
        return false;
    }
}
