package com.example.sms_listener;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
implements com.google.android.gms.tasks.OnFailureListener,
    com.google.android.gms.tasks.OnSuccessListener
{

    private static final String TAG = SmsReceiver.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        TextView textView = findViewById(R.id.textView);

        GetLocation gl = new GetLocation(this);
//        GetLocation gl = new GetLocation();

        textView.setText(gl.sayPrivet());
        gl.startUpdatesButtonHandler();

    }


    @Override
    public void onFailure(@NonNull Exception e) {

    }

    @Override
    public void onSuccess(Object o) {

    }
}