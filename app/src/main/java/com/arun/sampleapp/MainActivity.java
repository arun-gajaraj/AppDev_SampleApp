package com.arun.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view)
    {
        EditText nameText = (EditText) findViewById(R.id.nameField);
        String name = nameText.getText().toString();
        makeText(MainActivity.this, "Hi " + name + " !", Toast.LENGTH_SHORT).show();
    }
}
