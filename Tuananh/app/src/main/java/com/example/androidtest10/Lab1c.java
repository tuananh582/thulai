package com.example.androidtest10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Lab1c extends AppCompatActivity {
    private TextView display;
    private String currentDisplay = "";
    private String operator = "";
    private double firstNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1c);
        display = findViewById(R.id.display);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                String buttonText = button.getText().toString();

                switch (buttonText) {
                    case "=":
                        calculateResult();
                        break;
                    case "C":
                        clearDisplay();
                        break;
                    case "+/-":
                        toggleSign();
                        break;
                    case "%":
                        applyPercentage();
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        operator = buttonText;
                        firstNumber = Double.parseDouble(currentDisplay);
                        currentDisplay = "";
                        break;
                    default:
                        currentDisplay += buttonText;
                        display.setText(currentDisplay);
                        break;
                }
            }
        };

        int[] buttonIds = new int[] {
                R.id.button0, R.id.button1, R.id.button2, R.id.button3,
                R.id.button4, R.id.button5, R.id.button6, R.id.button7,
                R.id.button8, R.id.button9, R.id.buttonDot, R.id.buttonAdd,
                R.id.buttonSubtract, R.id.buttonMultiply, R.id.buttonDivide,
                R.id.buttonEquals, R.id.buttonC, R.id.buttonPlusMinus, R.id.buttonPercent
        };

        for (int id : buttonIds) {
            findViewById(id).setOnClickListener(listener);
        }
    }

    private void calculateResult() {
        double secondNumber = Double.parseDouble(currentDisplay);
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        display.setText(String.valueOf(result));
        currentDisplay = String.valueOf(result);
    }

    private void clearDisplay() {
        currentDisplay = "";
        firstNumber = 0;
        operator = "";
        display.setText("0");
    }

    private void toggleSign() {
        if (!currentDisplay.isEmpty()) {
            double value = Double.parseDouble(currentDisplay);
            value = -value;
            currentDisplay = String.valueOf(value);
            display.setText(currentDisplay);
        }
    }

    private void applyPercentage() {
        if (!currentDisplay.isEmpty()) {
            double value = Double.parseDouble(currentDisplay);
            value = value / 100;
            currentDisplay = String.valueOf(value);
            display.setText(currentDisplay);
        }
    }
}


