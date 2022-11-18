package com.project.driveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class hometemp extends AppCompatActivity {
    private Button cekhistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hometemp);

        cekhistory = (Button) findViewById(R.id.cekhistory);
        cekhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toHistory();
            }
        });
    }

    public void toHistory(){
        Intent intent = new Intent(this, HistoryDriver.class);
        startActivity(intent);
    }
}