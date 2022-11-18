package com.project.driveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverLoginActivity extends AppCompatActivity
{
    private Button DriverLoginButton;
    private Button DriverSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        DriverLoginButton = (Button) findViewById(R.id.driver_login_btn);
        DriverSignupButton = (Button) findViewById(R.id.driver_signup_btn);

        DriverLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent LoginDriverIntent = new Intent(DriverLoginActivity.this, hometemp.class);
                startActivity(LoginDriverIntent);
            }
        });

        DriverSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent SignupDriverIntent = new Intent(DriverLoginActivity.this, DriverSignupActivity.class);
                startActivity(SignupDriverIntent);
            }
        });
    }
}