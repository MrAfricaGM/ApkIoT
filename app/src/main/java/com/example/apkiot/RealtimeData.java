package com.example.apkiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class RealtimeData extends AppCompatActivity {

    private Button btnGoBack;
    private ProgressBar progressBar;
    private TextView progressText;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_data);

        btnGoBack = findViewById(R.id.btnGoBack);
        progressBar = findViewById(R.id.progress_bar);
        progressText = findViewById(R.id.progress_text);


        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RealtimeData.this, Dashboard.class);
                startActivity(intent);
            }
        });

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (i <= 100){
                    progressText.setText(i+"%");
                    progressBar.setProgress(i);
                    i++;
                    handler.postDelayed(this, 200);
                }
                else {
                    handler.removeCallbacks(this);
                }
            }
        },200);
    }
}