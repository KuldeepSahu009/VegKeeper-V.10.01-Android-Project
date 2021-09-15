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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginOptionActivity extends AppCompatActivity {
    Vibrator vibrator;
    Button OptionBtn;
    TextView termConditionBtn, privacyPolicyBtn, CopyrightOne;
    ImageView smallStudioIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        OptionBtn = (Button)findViewById(R.id.OptionButton);
        termConditionBtn = (TextView)findViewById(R.id.TermAndConditions);
        privacyPolicyBtn = (TextView)findViewById(R.id.PrivacyPolicy);
        CopyrightOne = (TextView)findViewById(R.id.Copyright_text_Two);
        smallStudioIcon = (ImageView)findViewById(R.id.Studio_Icon);
        //<-------------------------------------------------->

        // For After Click Option Button
        OptionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else{
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginOptionActivity.this, "-::Welcome::-", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginOptionActivity.this, LoginActivity.class));
            }
        });
        //---------------------------!For Option Button

        // For After Click Term and Condition Button
        termConditionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else{
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginOptionActivity.this, "Tearm & Conditions!", Toast.LENGTH_SHORT).show();
            }
        });
        //---------------------------!For Click Term and Condition Button

        // For After Click Privacy Policy Button
        privacyPolicyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else{
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginOptionActivity.this, "Privacy Policies!", Toast.LENGTH_SHORT).show();
            }
        });
        //---------------------------!For Privacy Policy Button

        // For After Click Studio Icon
        smallStudioIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else{
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginOptionActivity.this, "loading...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://skywarrior09.gq")));
            }
        });
        //---------------------------!For Studio Icon

        // For After click Copyright Texts
        CopyrightOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else{
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginOptionActivity.this, "loading...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://skywarrior09.gq")));
            }
        });
        //----------------------------!For Copyright Texts

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