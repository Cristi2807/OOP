package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Label firstNumber = new Label(" First number ");
        Label secondNumber = new Label(" Second number ");
        Label labelResult = new Label(" Result ");
        Label error = new Label();
        error.setTextFill(Color.color(1, 0, 0));

        TextField textFieldFirst = new TextField();
        TextField textFieldSecond = new TextField();
        TextField textFieldResult = new TextField();

        textFieldFirst.setOnMouseClicked(event -> error.setText(""));
        textFieldSecond.setOnMouseClicked(event -> error.setText(""));

        Button buttonClick = new Button("Calculate");

        buttonClick.setOnAction(event -> {

            try {
                float a = Float.parseFloat(textFieldFirst.getText());
                float b = Float.parseFloat(textFieldSecond.getText());

                if (b == 13) throw new UnluckyException();

                float res = a / b;

                if (Float.isNaN(res) || Float.isInfinite(res)) throw new ArithmeticException();

                textFieldResult.setText(Float.toString(res));

            } catch (NumberFormatException numberFormatException) {
                if (Objects.equals(textFieldFirst.getText(), "") || Objects.equals(textFieldSecond.getText(), ""))
                    error.setText("Missing input value!");
                else
                    error.setText("Number format exception!");
                textFieldResult.setText("");
            } catch (ArithmeticException arithmeticException) {
                error.setText("Division by zero!");
                textFieldResult.setText("");
            } catch (UnluckyException unluckyException) {
                error.setText("Divisor value is 13");
                textFieldResult.setText("");
            }

        });


        GridPane gridPane = new GridPane();


        gridPane.addRow(0, firstNumber);
        gridPane.addRow(1, textFieldFirst);
        gridPane.addRow(2, secondNumber);
        gridPane.addRow(3, textFieldSecond);
        gridPane.addRow(4, buttonClick);
        gridPane.addRow(5, error);
        gridPane.addRow(6,labelResult);
        gridPane.addRow(7, textFieldResult);


        Scene scene = new Scene(gridPane, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Dividing 2 numbers");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}