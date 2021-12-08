package com.example.myfirstcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private Button zero, one, two, three, four, five, six, seven, eight, nine, clear, add, subtract, multiply, divide, plusMinus, point, parenthesis;
    private ImageButton backspace;
    private TextView solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);

        zero = findViewById(R.id.zeroBTN);
        one = findViewById(R.id.oneBTN);
        two = findViewById(R.id.twoBTN);
        three = findViewById(R.id.threeBTN);
        four = findViewById(R.id.fourBTN);
        five = findViewById(R.id.fiveBTN);
        six = findViewById(R.id.sixBTN);
        seven = findViewById(R.id.sevenBTN);
        eight = findViewById(R.id.eightBTN);
        nine = findViewById(R.id.nineBTN);

        clear = findViewById(R.id.clearBTN);

        add = findViewById(R.id.addBTN);
        subtract = findViewById(R.id.subtractBTN);
        multiply = findViewById(R.id.multiplyBTN);
        divide = findViewById(R.id.divideBTN);

        plusMinus = findViewById(R.id.plusMinusBTN);
        point = findViewById(R.id.pointBTN);
        parenthesis = findViewById(R.id.parenthesisBTN);

        backspace = findViewById(R.id.backspaceBTN);

        solution = findViewById(R.id.solution);

        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().toString().equals(getString(R.string.display))){
                    display.setText("");
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("9");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearText();
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("delete");
            }
        });

        parenthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateText("(");
            }
        });

    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();

        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        System.out.println("\n================\nLeft: " + leftStr + "\nRight: " + rightStr + "\n================");

        System.out.println(">>>>>>>>>>>>>>>>>> " + display.getText().toString());

        if(display.getText().toString().equals(getString(R.string.display))){
            System.out.println(display.getText().toString() + display.getText().toString().equals(getString(R.string.display)) + " ======= " + strToAdd);
            display.setText("");
            display.setText(strToAdd);
        }

        if(strToAdd != "delete"){
            String newStr = String.format("%s%s%s", leftStr, strToAdd, rightStr);
            display.setText(newStr);
            display.setSelection(cursorPos + 1);
        }else{
            if(cursorPos != 0){
                System.out.println("DELETING...");
                leftStr = oldStr.substring(0, cursorPos-1);
                String newStr = String.format("%s%s", leftStr, rightStr);
                display.setText(newStr);
                display.setSelection(cursorPos - 1);
            }

        }

    }

    private void clearText(){
        display.setText("");
    }

}