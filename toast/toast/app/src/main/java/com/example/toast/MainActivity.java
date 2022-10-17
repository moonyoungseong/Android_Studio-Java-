package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Display;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("토스트연습");

        final Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Toast tMsg = Toast.makeText(MainActivity.this, "토스트연습",
                        Toast.LENGTH_LONG);

//                Display display = ((WindowManager) getSystemService(WINDOW_SERVICE))
//                        .getDefaultDisplay();
//                int xOffset = (int) (Math.random() * display.getWidth());
//                int yOffset = (int) (Math.random() * display.getHeight());

//                int xOffset = 0;
//                int yOffset = 0;

                //tMsg.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                tMsg.show();
            }
        });

    }
}