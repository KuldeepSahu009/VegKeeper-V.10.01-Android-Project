package com.rafale.vegkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class ForgotPassActivity extends AppCompatActivity {
    Vibrator vibrator;
    EditText forgotEmailInput;
    CheckBox forgotCheackBox;
    Button ResetBTn;
    TextView signInBtn, signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        forgotEmailInput = (EditText)findViewById(R.id.Email_Input_forgot);
        forgotCheackBox = (CheckBox)findViewById(R.id.Forgot_checkBox);
        ResetBTn = (Button)findViewById(R.id.Reset_Btn);
        signInBtn = (TextView)findViewById(R.id.alredyHaveAC);
        signUpBtn = (TextView)findViewById(R.id.createAc);
        //<-------------------------------------------------->

        // For After Click Reset Password Button
        ResetBTn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                String str_forgotEmailInput;
                str_forgotEmailInput = forgotEmailInput.getText().toString();

                if (str_forgotEmailInput.isEmpty()) {
                    forgotEmailInput.setError("please enter email address!");
                    forgotEmailInput.requestFocus();
                }
                else {
                    if (forgotCheackBox.isChecked()){
                        Toast.makeText(ForgotPassActivity.this, "link send to your email address!", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(ForgotPassActivity.this, LoginActivity.class));
                        finish();
                    }
                    else {
                        forgotCheackBox.setError("*required field");
                        forgotCheackBox.requestFocus();
                    }
                }
            }
        });
        //---------------------------!For Reset Password Button

        // For After Click Already have Account Button
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }
                Toast.makeText(ForgotPassActivity.this, "Sign-in", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ForgotPassActivity.this, LoginActivity.class));
                finish();
            }
        });
        //---------------------------!For Already have Account Button

        // For Create an Account Button
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }
                Toast.makeText(ForgotPassActivity.this, "Sign-up", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ForgotPassActivity.this, SignUpActivity.class));
                finish();
            }
        });
        //---------------------------!For Create an Account Button

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

        // For
        //---------------------------!For

        // For
        //---------------------------!For

    }// First @Override End

}//-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--|-|-< THE END >-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|