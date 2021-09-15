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
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

import java.util.Timer;
import java.util.TimerTask;

public class PhoneAuthActivity extends AppCompatActivity {
    Vibrator vibrator;
    CountryCodePicker ccp;
    EditText PhoneAuthInput;
    CheckBox checkBoxPhoneAuthAc;
    Button NumSubBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_auth);

        // For Remove Device title Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //---------------------------!For Device title Bar

        //<-------------------------------------------------->
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
        PhoneAuthInput = (EditText)findViewById(R.id.PhoneNumInput);
        checkBoxPhoneAuthAc = (CheckBox)findViewById(R.id.checkBox_PhoneAuthAc);
        NumSubBtn = (Button)findViewById(R.id.SummitBTN);
        //<-------------------------------------------------->

        //For Merge Country Code Picker to Phone Number Text
        ccp.registerCarrierNumberEditText(PhoneAuthInput);
        //<-------------------------------------------------->

        // For After Click Submit Button
        NumSubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
                }
                else {
                    vibrator.vibrate(50);
                }

                String numberInput_str = NumSubBtn.getText().toString();

                if (numberInput_str.isEmpty()){
                    PhoneAuthInput.setError("*phone number!");
                    PhoneAuthInput.requestFocus();
                    return;
                }
                else {
                    if (numberInput_str.length() > 11) {
                        PhoneAuthInput.setError("*invalid number");
                        PhoneAuthInput.requestFocus();
                        return;
                    }
                    else {
                        if (checkBoxPhoneAuthAc.isChecked()) {
                            Toast.makeText(PhoneAuthActivity.this, "Processing...", Toast.LENGTH_LONG).show();
                            Timer timer_auth = new Timer();
                            timer_auth.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        startActivity(new Intent(PhoneAuthActivity.this, OtpAuthActivity.class));
                                        finish();
                                    }
                            }, 1000);

                        }
                        else {
                                checkBoxPhoneAuthAc.setError("*required");
                                checkBoxPhoneAuthAc.requestFocus();
                                return;
                        }
                    }
                }

            }
        });
        //---------------------------!For Submit Button

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