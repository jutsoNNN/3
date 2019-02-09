package com.example.a3;

import android.widget.EditText;

public class NumberController {
    Double value;
    String displayValue;
    EditText display;

    public void setDisplay(EditText display) {
        this.display = display;
    }

    public NumberController() {
        displayValue = new String();
    }

    public void addDigit(int d) {
        if ((d >= 0) && (d <= 9) && (displayValue.length() < 12)) {
            displayValue = displayValue + Integer.toString(d);
            display();
        }
    }

    public void clear() {
        displayValue = "";
        if (displayValue.equals("")) {
            if (display != null) {
                display.setText("0");
            }
        }
    }

    public void clearLastDigit() {
        if (displayValue.length() > 0) {
            displayValue = displayValue.substring(0, displayValue.length() - 1);
            display();
        }
    }

    public void display() {
        if (display != null) {
            if (displayValue.equals("")) {
                display.setText("0");
            } else {
                display.setText(displayValue);
            }
        }
    }
}