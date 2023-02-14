package com.example.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Math.*;

public class CalcModel {
    Logger logger = Logger.getLogger(CalcModel.class.getName());

    public float calculation(float num1, float num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0)
                    return 0;
                return num1 / num2;
            default:
                logger.log(Level.INFO, "Error: Unknown operation selected");
                return 0;
        }
}
    public float squareRoot(float num1){
        return (float)sqrt(num1);
    }
    public double log(double num){
        if(num <= 0) {
            return 0;
        }
        return log10(num);
    }
}