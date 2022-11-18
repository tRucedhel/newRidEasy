package com.project.driveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class confirmation extends AppCompatActivity {
    private Button yes;
    private Button no;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        yes = (Button) findViewById(R.id.yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agree();
            }
        });

        no = (Button) findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disagree();
            }
        });
    }

    public void agree(){
        Intent intent = new Intent(this, statusyes.class);
        startActivity(intent);
    }

    public void disagree(){
        Intent intent = new Intent(this, statusno.class);
        startActivity(intent);
    }
}