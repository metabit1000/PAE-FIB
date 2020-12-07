package com.example.bargo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InfoBarActivity extends AppCompatActivity {

    Button reservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infobar);

        reservar = (Button) findViewById(R.id.reservaButton);

        reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoBarActivity.this, ReservarActivity.class);
                startActivity(intent);
            }
        });
    }
}
