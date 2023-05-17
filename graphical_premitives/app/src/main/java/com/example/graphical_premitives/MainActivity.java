package com.example.graphical_premitives;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    Bitmap bg;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg = Bitmap.createBitmap(720,1280, Bitmap.Config.RGB_565);
        img = findViewById(R.id.imageView);
        img.setImageBitmap(bg);
        // creating canvas object
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);
        // to draw rect
        canvas.drawText("rectangle",120,150,paint);
        canvas.drawRect(400,200,100,700,paint);
        // to draw circle
        canvas.drawText("circle",120,750,paint);
        canvas.drawCircle(170,950,100,paint);

    }
}