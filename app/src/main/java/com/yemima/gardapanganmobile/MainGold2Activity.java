package com.yemima.gardapanganmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainGold2Activity extends AppCompatActivity {
    private View otwrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindows);
        Toolbar toolbar = findViewById(R.id.toolbargold);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("");

        otwrate=findViewById(R.id.otwrate);
        otwrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahrr=new Intent(MainGold2Activity.this, RateActivity.class);
                startActivity(pindahrr);
            }
        });
    }
}
