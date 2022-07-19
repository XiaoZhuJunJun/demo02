package com.example.demo02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choose_AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_app);

        //获取按钮
        Button btn_MMR = findViewById(R.id.btn_MMR);
        Button btn_PMR = findViewById(R.id.btn_PMR);

        //按钮进行监听
        btn_MMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                intent.setClass(Choose_AppActivity.this,MMR_MainActivity.class);
                startActivity(intent);
            }

        });
        btn_PMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //监听按钮，如果点击，就跳转
                Intent intent = new Intent();
                intent.setClass(Choose_AppActivity.this,PMR_MainActivity.class);
                startActivity(intent);
            }

        });

    }
}