package com.rafale.vegkeeper;

import androidx.annotation.RequiresApi;
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

public class LoginActivity extends AppCompatActivity {
    Vibrator vibrator;
    EditText emailInput, passwordInput;
    CheckBox checkBoxLoginActivity;
    Button LoginButton;
    TextView CreateAccountBtn, ForgotPasswordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        emailInput = (EditText)findViewById(R.id.Email);
        passwordInput = (EditText)findViewById(R.id.Password);
        checkBoxLoginActivity = (CheckBox)findViewById(R.id.checkBox);
        LoginButton = (Button)findViewById(R.id.SignIn_Btn);
        CreateAccountBtn = (TextView)findViewById(R.id.CreateAC_Btn);
        ForgotPasswordBtn = (TextView)findViewById(R.id.ForgotPASS_Btn);
        //<-------------------------------------------------->

        // For After Click Forgot Password Button
        ForgotPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginActivity.this, "Enter your registered E-mail", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, ForgotPassActivity.class));
                finish();
            }
        });
        //---------------------------!For Forgot Password Button

        // For After Click Create Account Button
        CreateAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }
                Toast.makeText(LoginActivity.this, "Create new account", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
                finish();
            }
        });
        //---------------------------!For Create Account Button

        // For After Click Verify/Login Button
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT_WATCH)
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                String str_email, str_password;
                str_email = emailInput.getText().toString();
                str_password = passwordInput.getText().toString();

                if (str_email.isEmpty()) {
                    emailInput.setError("please enter email address!");
                    emailInput.requestFocus();
                    return;
                }

                if (str_password.isEmpty()) {
                    passwordInput.setError("please enter password");
                    passwordInput.requestFocus();
                    return;
                }

                if (str_email.length() < 6) {
                    passwordInput.setError("password must be six characters!");
                    passwordInput.requestFocus();
                    return;
                }

                if (checkBoxLoginActivity.isChecked()) {
                    if (str_password.equals("kuldeep123")) {
                        Toast.makeText(LoginActivity.this, "processing...", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                        finish();
                    }
                    else {
                        Toast.makeText(LoginActivity.this, "Testing pass 'kuldeep123'", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    checkBoxLoginActivity.setError("*required field!");
                    checkBoxLoginActivity.requestApplyInsets();
                    return;
                }

            }
        });
        //---------------------------!For Verify/Login Button

        // For
        //---------------------------!For

        // For
        //---------------------------!For

        // For
        //---------------------------!For

    }// First @Override End

}//-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--|-|-< THE END >-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|