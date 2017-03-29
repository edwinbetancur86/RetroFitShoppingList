package com.edwinb.retrofitshoppinglist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.edwinb.retrofitshoppinglist.R;



public class ButtonActivity extends AppCompatActivity {

    private TextView textViewMovieTitle;
    private EditText editTextMovieSum;
    private Intent i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);


        textViewMovieTitle = (TextView) findViewById(R.id.textViewMovieTitle);
        editTextMovieSum = (EditText) findViewById(R.id.editTextMovieSum);




        i = getIntent();

        textViewMovieTitle.setText(i.getStringExtra("movieTitle"));

        editTextMovieSum.setText(i.getStringExtra("movieSum"));

    }




}