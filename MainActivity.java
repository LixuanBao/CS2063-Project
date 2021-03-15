package ca.unb.mobiledev.cs20063project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView changeButton;
    private ImageView startButton;
    private ImageView leaderBoardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (ImageView) findViewById(R.id.imageButton1);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SelectActivity.class));
            }
        });

        leaderBoardButton = (ImageView) findViewById(R.id.imageButton2);
        leaderBoardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LeaderBoardActivity.class));
            }
        });

        changeButton = (ImageView) findViewById(R.id.imageView);
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChangeCharacter.class));
            }
        });
    }
}