package com.example.multi_threading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        img = (ImageView) findViewById(R.id.imageView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        boolean post = img.post(new Runnable() {
                            @Override
                            public void run() {
                                img.setImageResource(R.drawable.ic_launcher_background);
                            }
                        });
                    }
                }).start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        boolean post = img.post(new Runnable() {
                            @Override
                            public void run() {
                                img.setImageResource(R.drawable.ic_launcher_foreground);
                            }
                        });
                    }
                }).start();
            }
        });

    }
}














//package com.example.multi_threading;
//import androidx.appcompat.app.AppCompatActivity;
//
























//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import java.util.Date;
//
//public class MainActivity extends AppCompatActivity {
//
//    private TextView textView;
//    private Handler handler;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        textView = findViewById(R.id.textView);
//        handler = new Handler();
//
//        // Create a new thread and start it
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // Perform some time-consuming operation in the background
//                while (true) {
//                    String result = performOperation();
//
//                    // Update the UI on the main thread with the result
//                    handler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            textView.setText(result);
//                        }
//                    });
//
//                    // Wait for a short interval before performing the operation again
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();
//    }
//
//    private String performOperation() {
//        // Simulate a time-consuming operation
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return "Operation complete at " + new Date().toString();
//    }
//}
//
//
//
//
//
