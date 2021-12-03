package com.example.myfirstcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private Button zero, one, two, three, four, five, six, seven, eight, nine, clear, add, subtract, multiply, divide, plusMinus, point, parenthesis;
    private ImageButton backspace;

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

        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(display.getText().toString().equals(getString(R.string.display))){
                    display.setText("");
                }
            }
        });

    }

}