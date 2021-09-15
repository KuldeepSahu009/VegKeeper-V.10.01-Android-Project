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

public class SignUpActivity extends AppCompatActivity {
    Vibrator vibrator;
    EditText fullNameInput, eMailInput, createPassInput, confirmPassInput;
    CheckBox signUpCheckbox;
    Button SignUpCreateButton;
    TextView SignInQueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        fullNameInput = (EditText)findViewById(R.id.fullName);
        eMailInput = (EditText)findViewById(R.id.emailaddress);
        createPassInput = (EditText)findViewById(R.id.createPass);
        confirmPassInput = (EditText)findViewById(R.id.confirmPass);
        signUpCheckbox = (CheckBox)findViewById(R.id.SignUpAcCheckBox);
        SignUpCreateButton = (Button)findViewById(R.id.SignIn_btn_create);
        SignInQueButton = (TextView)findViewById(R.id.SignIn_buttonn);
        //<-------------------------------------------------->

        // For After Click SignUp Button
        SignUpCreateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                String FullNameInput_Str, EmailInput_Str, CreatePassInput_Str, ConfirmPassInput_Str;
                FullNameInput_Str = fullNameInput.getText().toString();
                EmailInput_Str = eMailInput.getText().toString();
                CreatePassInput_Str = createPassInput.getText().toString();
                ConfirmPassInput_Str = confirmPassInput.getText().toString();

                if (FullNameInput_Str.isEmpty()){
                    fullNameInput.setError("*required field!");
                    fullNameInput.requestFocus();
                    return;
                }

                if (EmailInput_Str.isEmpty()){
                    eMailInput.setError("*required field!");
                    eMailInput.requestFocus();
                    return;
                }

                if (CreatePassInput_Str.isEmpty()){
                    createPassInput.setError("*required field!");
                    createPassInput.requestFocus();
                    return;
                }

                if (ConfirmPassInput_Str.isEmpty()){
                    confirmPassInput.setError("*required field!");
                    confirmPassInput.requestFocus();
                    return;
                }

                if (CreatePassInput_Str.length() < 6) {
                    createPassInput.setError("password must be six characters!");
                    createPassInput.requestFocus();
                    return;
                }
                else {
                    if (CreatePassInput_Str.equals(ConfirmPassInput_Str)) {
                        if (signUpCheckbox.isChecked()) {
                            Toast.makeText(SignUpActivity.this, "successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignUpActivity.this, PhoneAuthActivity.class));
                            finish();
                        }
                        else {
                            signUpCheckbox.setError("*required");
                            signUpCheckbox.requestFocus();
                            return;
                        }
                    }
                    else{
                        confirmPassInput.setError("password mismatch!");
                        confirmPassInput.requestFocus();
                        return;
                    }
                }
            }
        });
        //---------------------------!For SignUp Button

        // For After Click SignIn/Already have an Account Button
        SignInQueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }
                Toast.makeText(SignUpActivity.this, "Sign-In", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                finish();
            }
        });
        //---------------------------!For SignIn/Already have an Account Button

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