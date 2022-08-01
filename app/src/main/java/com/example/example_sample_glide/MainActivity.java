package com.example.example_sample_glide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        Context context = MainActivity.this;

        Glide.with(context)
                .load(com.bumptech.glide.R.drawable.abc_ic_star_black_16dp)
                .into(imageView);


    }
}