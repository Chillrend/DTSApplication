package org.chillrend.DTSApplication;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_ok = findViewById(R.id.button_to_red);
        final Button red_btn = findViewById(R.id.button);
        final Button btn_lat_menu = findViewById(R.id.button_to_menu);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red_btn.setBackgroundColor(Color.RED);
            }
        });

        btn_lat_menu.setOnClickListener(view -> {
            startActivity(new Intent(this, MenuActivity.class));
        });
    }
}