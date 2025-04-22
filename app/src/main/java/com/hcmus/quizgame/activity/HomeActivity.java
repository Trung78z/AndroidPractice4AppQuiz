package com.hcmus.quizgame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hcmus.quizgame.MainActivity;
import com.hcmus.quizgame.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imgLogoCenter = findViewById(R.id.img_logo_center);
        ImageView imgLogoTopCenter = findViewById(R.id.img_logo_top_center);
        ImageView imgLogoTopRight = findViewById(R.id.img_logo_top_right);
        ImageView imgLogoBottomRight = findViewById(R.id.img_logo_bottom_right);
        ImageView imgLogoBottomCenter = findViewById(R.id.img_logo_bottom_center);
        ImageView imgLogoBottomLeft = findViewById(R.id.img_logo_bottom_left);
        ImageView imgLogoTopLeft = findViewById(R.id.img_logo_top_left);


        imgLogoCenter.setOnClickListener(v -> ChangeToScore());
        imgLogoTopCenter.setOnClickListener(v -> ChangeToScore());
        imgLogoTopRight.setOnClickListener(v -> ChangeToScore());
        imgLogoBottomRight.setOnClickListener(v -> ChangeToScore());
        imgLogoBottomCenter.setOnClickListener(v -> ChangeToScore());
        imgLogoBottomLeft.setOnClickListener(v -> ChangeToScore());
        imgLogoTopLeft.setOnClickListener(v -> ChangeToScore());
    }

    private void ChangeToScore() {
        startActivity(new Intent(HomeActivity.this, ScoreActivity.class));
        finish();
    }
}
