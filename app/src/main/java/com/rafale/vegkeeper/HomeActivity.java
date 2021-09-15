package com.rafale.vegkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.time.Period;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {
    Vibrator vibrator;
    ImageView CheackIcon, DeveloperIcon, PersonIcon;
    TextView Url_link;
    Button LogOutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        CheackIcon = (ImageView)findViewById(R.id.SusscessfulIcon);
        DeveloperIcon = (ImageView)findViewById(R.id.lapIcon);
        PersonIcon = (ImageView)findViewById(R.id.personIcon);
        Url_link = (TextView)findViewById(R.id.T_6);
        LogOutBtn = (Button)findViewById(R.id.LogoutBtn);
        //<-------------------------------------------------->

        // For After Click Check Icon
        CheackIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                Toast.makeText(HomeActivity.this, "Successful...!", Toast.LENGTH_SHORT).show();
            }
        });
        //---------------------------!For Check Icon

        // For After Click Laptop Icon
        DeveloperIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                Toast.makeText(HomeActivity.this, "Developer Studio!", Toast.LENGTH_SHORT).show();
            }
        });
        //---------------------------!For Laptop Icon

        // For After Click Person Icon
        PersonIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                Toast.makeText(HomeActivity.this, "Developer..!", Toast.LENGTH_SHORT).show();
            }
        });
        //---------------------------!For Person Icon

        // For After Click Url_link
        Url_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                Toast.makeText(HomeActivity.this, "loading...", Toast.LENGTH_LONG).show();
                Timer timeHomeAc = new Timer();
                timeHomeAc.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://skywarrior09.gq")));
                    }
                }, 1000);
            }
        });
        //---------------------------!For Url_link

        // For After Click Logout Btn
        LogOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                Toast.makeText(HomeActivity.this, "login out", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
                finish();
            }
        });
        //---------------------------!For Logout Btn

        // For
        //---------------------------!For

        // For
        //---------------------------!For

        // For
        //---------------------------!For

        // For
        //---------------------------!For

        // For
        //---------------------------!For

    }// First @Override End

}//-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--|-|-< THE END >-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|