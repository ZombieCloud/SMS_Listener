package com.example.sms_listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = SmsReceiver.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        TextView textView = findViewById(R.id.textView);

        GetLocation gl = new GetLocation();
        textView.setText(gl.sayPrivet());

    }


}