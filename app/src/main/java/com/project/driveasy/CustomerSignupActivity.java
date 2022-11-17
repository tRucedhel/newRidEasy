package com.project.driveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerSignupActivity extends AppCompatActivity
{
    private Button CustomerSigninButton;
    private Button CustomerSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_signup);

        CustomerSigninButton = (Button) findViewById(R.id.customer_signin_btnreg);
        CustomerSignupButton = (Button) findViewById(R.id.customer_signup_btnreg);

        CustomerSigninButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent SigninCustomerIntent = new Intent(CustomerSignupActivity.this, CustomerLoginActivity.class);
                startActivity(SigninCustomerIntent);
            }
        });

        CustomerSignupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent SignupCustomerIntent = new Intent(CustomerSignupActivity.this, PraLoginActivity.class);
                startActivity(SignupCustomerIntent);
            }
        });
    }
}