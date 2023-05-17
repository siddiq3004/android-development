package com.example.claci;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Button add, sub, mul, div;
    private EditText num1, num2;
    private double res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.subtract);
        mul = findViewById(R.id.multiply);
        div = findViewById(R.id.divide);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = num1.getText().toString();
                String second = num2.getText().toString();

                double s1 = Double.parseDouble(first);
                double s2 = Double.parseDouble(second);
                res = s1+s2;
                result.setText("Result :"+res);
                res = 0;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = num1.getText().toString();
                String second = num2.getText().toString();

                double s1 = Double.parseDouble(first);
                double s2 = Double.parseDouble(second);
                res = s1-s2;
                result.setText("Result :"+res);
                res = 0;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = num1.getText().toString();
                String second = num2.getText().toString();

                double s1 = Double.parseDouble(first);
                double s2 = Double.parseDouble(second);
                res = s1*s2;
                result.setText("Result :"+res);
                res = 0;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = num1.getText().toString();
                String second = num2.getText().toString();

                double s1 = Double.parseDouble(first);
                double s2 = Double.parseDouble(second);
                res = s1/s2;
                result.setText("Result :"+res);
                res = 0;
            }
        });
    }
}