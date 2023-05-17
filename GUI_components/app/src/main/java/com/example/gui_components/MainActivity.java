package com.example.gui_components;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {
    int ch = 1;
    float fsize = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.textView);
        Button b1 = (Button) findViewById(R.id.btnsize);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(fsize);
                fsize = fsize+5;
                if(fsize==50)
                    fsize = 30;
            }
        });
        Button b2 = (Button) findViewById(R.id.btncolur);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch){
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 7:
                        t.setTextColor(Color.GRAY);
                        break;
                }
                ch++;
                if (ch==8)
                    ch = 1;

            }
        });
    }
}