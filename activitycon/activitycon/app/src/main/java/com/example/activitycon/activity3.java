package com.example.activitycon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button b4 = (Button) findViewById(R.id.button3_3);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });

    }
}