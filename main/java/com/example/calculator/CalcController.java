package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class CalcController {
    @FXML
    private Text output;
    private float num1 = 0;
    private String op = "";
    private boolean start = true;
    private CalcModel model = new CalcModel();

    @FXML
    private void numSelection(ActionEvent event){
        if(start){
            output.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }
    @FXML
    private void numOperation(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!op.isEmpty())
                return;
            op = value;
            num1 = Float.parseFloat(output.getText());
            output.setText("");
        }else if(op.equals("√")){
            output.setText(String.valueOf(model.squareRoot(num1)));
            op = "";
            start = true;
        }else if(op.equals("Log")){
            double result = model.log(num1);
            if(result == 0){
                output.setText("NaN or ∞");

            }else {
                int res;
                String doubleAsText = String.valueOf(result);
                double number = Double.parseDouble(doubleAsText);
                int fractional = Integer.parseInt(doubleAsText.substring(doubleAsText.indexOf('.') + 1, doubleAsText.indexOf('.') + 2));
                if (fractional == 0) {
                    res = (int) result;
                    output.setText(String.valueOf(res));
                } else {
                    output.setText(String.valueOf(result));
                }
                op = "";
                start = true;
            }
        }else{
            if(op.isEmpty()){
                System.out.println("No operation selected");
                return;
            }
            output.setText(String.valueOf(model.calculation(num1, Float.parseFloat(output.getText()), op)));
            op = "";
            start = true;
        }
    }
    @FXML
    private void numCancel(){
        num1 = 0;
        op = "";
        start = true;
        output.setText("");
    }
}