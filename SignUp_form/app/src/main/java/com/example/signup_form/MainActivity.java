package com.example.signup_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user = (EditText) findViewById(R.id.user);
        EditText password = (EditText) findViewById(R.id.pass);

        Button btnrg = (Button) findViewById(R.id.btnrg);

        btnrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
//                String username = user.getText().toString();
//                if (username.isEmpty())
//
//                    Toast.makeText(MainActivity.this, "Enter Username", Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(MainActivity.this, "username is "+username, Toast.LENGTH_SHORT).show();
                if (user.getText().toString().isEmpty()){
                    user.setError("username required");
                }
                if(password.getText().toString().isEmpty()){
                    password.setError("password required");
                }
                if (password.getText().toString().isEmpty() == false){
                    if(password.getText().length() < 8){
                        password.setError("Password should be at least 8 characters");
                    }
                }
                if(password.getText().toString().length() > 8 && user.getText().toString().length()!=0){
                    Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//
//
//            }
//        });
//    }
