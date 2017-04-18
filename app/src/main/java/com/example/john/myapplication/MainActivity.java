package com.example.john.myapplication;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

import static android.os.Environment.getExternalStorageDirectory;
import static android.os.Environment.getExternalStoragePublicDirectory;
import static android.os.Environment.getExternalStorageState;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    String string = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ThisButton = (Button) findViewById(R.id.a_button);

        string = "this is onCreate speaking";
        Log.e("onCreate", string);

        final String state = Environment.getExternalStorageState();
        final File directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        ThisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (directory.exists()) {
                   Toast.makeText(getApplicationContext(), "exists", Toast.LENGTH_LONG).show();

               }

            }
        });
    }
}
