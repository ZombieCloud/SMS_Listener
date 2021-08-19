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

//        gl = new GetLocation(this);
    }

    public void sendMessage(View view) {
        TextView textView = findViewById(R.id.textView);

        gl = new GetLocation(this);
//        while (gl.Longitude == "" && gl.Latitude == "") {}

        textView.setText(gl.sayPrivet());
//        Toast.makeText(this, "Latitude = " + gl.get_Latitude() + "    " + "Longitude = " + gl.get_Longitude(), Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "Latitude = " + gl.Latitude + "    " + "Longitude = " + gl.Longitude, Toast.LENGTH_LONG).show();

    }


//    @Override
//    public void onFailure(@NonNull Exception e) {    }

//    @Override
//    public void onSuccess(Object o) {    }

}