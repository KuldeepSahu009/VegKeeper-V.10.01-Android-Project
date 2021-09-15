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

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class OtpAuthActivity extends AppCompatActivity {
     Vibrator vibrator;
     EditText OTPinput;
     CheckBox checkBox_OtpAc;
     Button OtpVerifyBtn;
     TextView ResendOTPbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_auth);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        OTPinput = (EditText)findViewById(R.id.OTPinput);
        checkBox_OtpAc = (CheckBox)findViewById(R.id.checkBox_otpAc);
        OtpVerifyBtn = (Button)findViewById(R.id.Otp_Verify_Btn);
        ResendOTPbtn = (TextView)findViewById(R.id.ResendOTPbtn);
        //<-------------------------------------------------->

        // For After Click Verify Button
        OtpVerifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                String OTPinput_str = OTPinput.getText().toString();

                if (OTPinput_str.isEmpty()) {
                    OTPinput.setError("*Enter your OTP");
                    OTPinput.requestFocus();
                    return;
                }
                else {
                    if (OTPinput_str.length() > 4) {
                        OTPinput.setError("*invalid OTP");
                        OTPinput.requestFocus();
                        return;
                    }
                    else {
                        if (OTPinput_str.length() < 4) {
                            OTPinput.setError("**invalid OTP!");
                            OTPinput.requestFocus();
                            return;
                        }
                        else {
                            if (checkBox_OtpAc.isChecked()) {
                                Toast.makeText(OtpAuthActivity.this, "Verifying...", Toast.LENGTH_LONG).show();
                                Timer timer_otpAuth = new Timer();
                                timer_otpAuth.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        startActivity(new Intent(OtpAuthActivity.this, HomeActivity.class));
                                        finish();
                                    }
                                }, 1000);
                            }
                            else {
                                checkBox_OtpAc.setError("*required!");
                                checkBox_OtpAc.requestFocus();
                                return;
                            }
                        }
                    }
                }
            }
        });
        //---------------------------!For Verify Button

        // For After Click Resend OTP Button
        ResendOTPbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }
                Toast.makeText(OtpAuthActivity.this, "OTP resend successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(OtpAuthActivity.this, OtpAuthActivity.class));
                finish();
            }
        });
        //---------------------------!For Resend OTP Button

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

        // For
        //---------------------------!For

    }// First @Override End

}//-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|--|-|-< THE END >-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|