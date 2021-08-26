package com.example.sms_listener;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = SmsReceiver.class.getSimpleName();

    private GetLocation gl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().hasExtra("STR_TEL_NUMBER")) {
            Bundle extras = getIntent().getExtras();
            gl = new GetLocation(this, extras.getString("STR_TEL_NUMBER"));
        }

    }


    public void sendMessage(View view) {
        TextView textView = findViewById(R.id.textView);
        gl = new GetLocation(this, null);
        textView.setText(gl.sayPrivet());
    }


}