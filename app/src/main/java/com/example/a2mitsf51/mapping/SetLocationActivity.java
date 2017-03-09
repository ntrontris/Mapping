package com.example.a2mitsf51.mapping;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetLocationActivity extends AppCompatActivity implements View.OnClickListener



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);

        Button submitButton = (Button) findViewById (R.id.submitbutton)
        submitButton.setOnClickListener (this);
        }


    @Override
    public void onClick(View view)

        //retrieve our lat and long values from the edit text box
        EditText latitudeEditText = (EditText) findViewById(R.id.latitudeeditText);
        double latitude = Double.parseDouble(latitudeEditText.getText().toString());

        EditText longitudeEditText = (EditText) findViewById(R.id.longitudeeditText);
        double longitude = Double.parseDouble(longitudeEditText.getText().toString());

        //asseble our last lat long bundle
        Bundle latlongBundle = new Bundle()