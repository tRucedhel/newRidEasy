package com.project.driveasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DriverSignupActivity extends AppCompatActivity
{
    private Button DriverSigninButton;
    private Button DriverSignupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_signup);

        DriverSigninButton = (Button) findViewById(R.id.driver_signin_btnreg);
        DriverSignupButton = (Button) findViewById(R.id.driver_signup_btnreg);

        DriverSigninButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent SigninDriverIntent = new Intent(DriverSignupActivity.this, DriverLoginActivity.class);
                startActivity(SigninDriverIntent);
            }
        });

        final EditText DriverFirstNameReg = findViewById(R.id.driver_firstname_reg);
        final EditText DriverLastNameReg = findViewById(R.id.driver_lastname_reg);
        final EditText DriverEmail = findViewById(R.id.driver_email);
        final EditText DriverPassReg = findViewById(R.id.driver_pass);
        final EditText DriverCopass = findViewById(R.id.driver_copass);


        DAODriverSignupFB dao = new DAODriverSignupFB();
        DriverSignupButton.setOnClickListener(view ->  {
            DriverSignupFB driver=new DriverSignupFB(DriverFirstNameReg.getText().toString(),
                    DriverLastNameReg.getText().toString(),
                    DriverEmail.getText().toString(),
                    DriverPassReg.getText().toString(),
                    DriverCopass.getText().toString());
            dao.add(driver).addOnSuccessListener(suc ->{
                Toast.makeText(this,"Berhasil membuat akun", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,MenuDriver.class);
                startActivity(intent);
            }).addOnFailureListener(err->{
                Toast.makeText(this,""+err.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}
