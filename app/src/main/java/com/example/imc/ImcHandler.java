package com.example.imc;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ImcHandler {
    Button calculateButton;
    EditText weightEditText;
    EditText sizeEditText;
    ImageView resultImageView;
    TextView resultTextView;

    TextView resultLabel;

    public ImcHandler() {
    }

    public ImcHandler(Button calculateButton, EditText weightEditText, EditText sizeEditText, ImageView resultImageView, TextView resultTextView, TextView resultLabel) {
        this.calculateButton = calculateButton;
        this.weightEditText = weightEditText;
        this.sizeEditText = sizeEditText;
        this.resultImageView = resultImageView;
        this.resultTextView = resultTextView;
        this.resultLabel = resultLabel;
    }

    /**
     * Calculate the IMC and display the result
     */
    public void calculateImc() {
        String weight = weightEditText.getText().toString();
        String size = sizeEditText.getText().toString();
        if (weight.isEmpty() || size.isEmpty())
            return;

        float weightFloat = Float.parseFloat(weight);
        float sizeFloat = Float.parseFloat(size);
        // change the size from cm to m
        sizeFloat /= 100;
        float imc = weightFloat / (sizeFloat * sizeFloat);
        resultLabel.setText("Votre IMC est de : ");

        if (imc < 18.5) {
            resultTextView.setText("maigre");
            resultImageView.setImageResource(R.drawable.maigre);
        } else if (imc >= 18.5 && imc < 25) {
            resultTextView.setText("normale");
            resultImageView.setImageResource(R.drawable.normal);
        } else if (imc >= 25 && imc < 35) {
            resultTextView.setText("sur poids");
            resultImageView.setImageResource(R.drawable.surpoids);
        } else if (imc >= 35 && imc < 40) {
            resultTextView.setText("Obese");
            resultImageView.setImageResource(R.drawable.obese);
        } else if (imc >= 40) {
            resultTextView.setText("Trop Obese");
            resultImageView.setImageResource(R.drawable.tobese);
        }
    }

    /**
     * Set the calculate button listener
     */
    public void setCalculateButtonListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateImc();
            }
        });
    }

    public TextView getResultLabel() {
        return resultLabel;
    }

    public void setResultLabel(TextView resultLabel) {
        this.resultLabel = resultLabel;
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    public void setCalculateButton(Button calculateButton) {
        this.calculateButton = calculateButton;
    }

    public EditText getWeightEditText() {
        return weightEditText;
    }

    public void setWeightEditText(EditText weightEditText) {
        this.weightEditText = weightEditText;
    }

    public EditText getSizeEditText() {
        return sizeEditText;
    }

    public void setSizeEditText(EditText sizeEditText) {
        this.sizeEditText = sizeEditText;
    }

    public ImageView getResultImageView() {
        return resultImageView;
    }

    public void setResultImageView(ImageView resultImageView) {
        this.resultImageView = resultImageView;
    }

    public TextView getResultTextView() {
        return resultTextView;
    }

    public void setResultTextView(TextView resultTextView) {
        this.resultTextView = resultTextView;
    }
}
