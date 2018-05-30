package com.lifeistech.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int number = 0;
    public int answer = 0;
    public int operation = 0;

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");
    }

    public void zero(View v) {
        up(0);
    }

    public void one(View v) {
        up(1);
    }

    public void two(View v) {
        up(2);
    }

    public void three(View v) {
        up(3);
    }

    public void four(View v) {
        up(4);
    }

    public void five(View v) {
        up(5);
    }

    public void six(View v) {
        up(6);
    }

    public void seven(View v) {
        up(7);
    }

    public void eight(View v) {
        up(8);
    }

    public void nine(View v) {
        up(9);
    }


    public void plus(View v) {
        calculate();
        operation=1;
        textView.setText("+");
    }
    public void minus(View v) {
        calculate();
        operation=2;
        textView.setText("-");

    }
    public void multiplication(View v) {
        calculate();
        operation=3;
        textView.setText("×");

    }
    public void division(View v) {
        calculate();
        operation=4;
        textView.setText("÷");

    }
    public void equal(View v){
        calculate();
        textView.setText(String.valueOf(answer));
        allClear();
    }


    public void up(int i) {
        number = number * 10 + i;
        textView.setText(String.valueOf(number));
    }

    public void calculate() {
        switch (operation) {
            case 0:
                answer = number;
                break;
            case 1:
                answer += number;
                break;
            case 2:
                answer -= number;
                break;
            case 3:
                answer *= number;
                break;
            case 4:
                if (number == 0) {
                    Toast.makeText(this, "0でわることはできません", Toast.LENGTH_LONG).show();
                } else {
                    answer /= number;
                    break;
                }
        }
        number=0;
    }
    public void allClear(){
        number=0;answer=0;operation=0;

    }
    public void c(View v){
        textView.setText("0");
        allClear();
    }
}
