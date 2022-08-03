package com.aniketjain.roastedt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aniketjain.roastedtoast.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // demo
        findViewById(R.id.btn1).setOnClickListener(v -> {
            Toasty.normal(this, "Normal Toast");
        });

        findViewById(R.id.btn2).setOnClickListener(v -> {
            Toasty.success(this, "Success Toast");
        });

        findViewById(R.id.btn3).setOnClickListener(v -> {
            Toasty.error(this, "Error Toast");
        });

        findViewById(R.id.btn4).setOnClickListener(v -> {
            Toasty.warning(this, "Warning Toast");
        });

        findViewById(R.id.btn5).setOnClickListener(v -> {
            Toasty.custom(this, "Custom Toast", R.drawable.ic_android_black_24dp, "#323232", 17, "#f9f9f9");
        });

    }
}