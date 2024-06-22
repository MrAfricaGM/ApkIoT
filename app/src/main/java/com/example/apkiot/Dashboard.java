package com.example.apkiot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView RealtimeDataCard, ExitCard, ChartCard, SettingsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        RealtimeDataCard = findViewById(R.id.RealtimeDataCard);

        RealtimeDataCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, RealtimeData.class);
                startActivity(intent);
            }
        });

        ExitCard = findViewById(R.id.ExitCard);

        ExitCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ChartCard = findViewById(R.id.ChartCard);

        ChartCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Chart.class);
                startActivity(intent);
            }
        });

        SettingsCard = findViewById(R.id.SettingsCard);

        SettingsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Settings.class);
                startActivity(intent);
            }
        });
    }
}