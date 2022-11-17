package com.project.driveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PraLoginActivity extends AppCompatActivity
{
    private Button driverbutton;
    private Button customerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pralogin);

        driverbutton = (Button) findViewById(R.id.button_driver);
        customerbutton = (Button) findViewById(R.id.customer_login_btn);

        driverbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent BeforeLoginDriverIntent = new Intent(PraLoginActivity.this, DriverLoginActivity.class);
                startActivity(BeforeLoginDriverIntent);
            }
        });
        customerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent BeforeLoginCustomerIntent = new Intent(PraLoginActivity.this, CustomerLoginActivity.class);
                startActivity(BeforeLoginCustomerIntent);
            }
        });
    }
}