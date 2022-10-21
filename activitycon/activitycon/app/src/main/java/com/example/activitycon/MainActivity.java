package com.example.activitycon;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        activity2.class);
                // 다음 화면으로 넘어간다
                startActivity(intent);

            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        activity3.class);
                startActivity(intent); // 다음 화면으로 넘어간다

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()) {

            case R.id.menu1:

                Toast.makeText(this, "menu1 select", Toast.LENGTH_SHORT).show();

                Intent intent; // 다음 넘어갈 클래스 지정
                intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        MainActivity.class);
                startActivity(intent); // 다음 화면으로 넘어간다

                break;

            case R.id.menu2:

                Toast.makeText(this, "menu2 select", Toast.LENGTH_SHORT).show();

                Intent intent1; // 다음 넘어갈 클래스 지정
                intent1 = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        activity2.class);
                startActivity(intent1); // 다음 화면으로 넘어간다

                break;

            case R.id.menu3:

                Toast.makeText(this, "menu3 select", Toast.LENGTH_SHORT).show();
                Intent intent2; // 다음 넘어갈 클래스 지정
                intent2 = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        activity3.class);
                startActivity(intent2); // 다음 화면으로 넘어간다

                break;

        }

        return super.onOptionsItemSelected(item);
    }
}