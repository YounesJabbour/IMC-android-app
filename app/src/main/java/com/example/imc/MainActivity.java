package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImcHandler imcHandler = new ImcHandler();

        imcHandler.setCalculateButton(findViewById(R.id.calculateButton));
        imcHandler.setWeightEditText(findViewById(R.id.weightInput));
        imcHandler.setSizeEditText(findViewById(R.id.sizeInput));
        imcHandler.setResultImageView(findViewById(R.id.resultImage));
        imcHandler.setResultTextView(findViewById(R.id.resultText));
        imcHandler.setResultLabel(findViewById(R.id.resultLabel));

        /**
         * Set the calculate button listener
         */
        imcHandler.setCalculateButtonListener();
    }
}