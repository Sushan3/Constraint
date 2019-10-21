package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnmultiple, btnsevennum, btneightnum, btnninenum, btnadd, btnfournum, btnfivenum;
    Button btnsixnum, btnsubtract, btnonenum, btntwonum, btnthreenum, btnclear, btnzeronum;
    Button btnequal, btndivide;
    EditText numbertext;
    String displayNum = "";
    String symbol;
    float valueOne, valueTwo, res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnonenum = findViewById(R.id.btnOne);
        btntwonum = findViewById(R.id.btnTwo);
        btnthreenum = findViewById(R.id.btnThree);
        btnfournum = findViewById(R.id.btnFour);
        btnfivenum = findViewById(R.id.btnFive);
        btnsixnum = findViewById(R.id.btnSix);
        btnsevennum = findViewById(R.id.btnSeven);
        btneightnum = findViewById(R.id.btnEight);
        btnninenum = findViewById(R.id.btnNine);
        btnzeronum = findViewById(R.id.btnZero);
        btnclear = findViewById(R.id.btnClear);
        btnequal = findViewById(R.id.btnEqual);
        btnadd = findViewById(R.id.btnAdd);
        btnsubtract = findViewById(R.id.btnSubtract);
        btndivide = findViewById(R.id.btnDivide);
        btnmultiple = findViewById(R.id.btnMultiply);

        numbertext = findViewById(R.id.btnText);


        btnonenum.setOnClickListener(this);
        btntwonum.setOnClickListener(this);
        btnthreenum.setOnClickListener(this);
        btnfournum.setOnClickListener(this);
        btnfivenum.setOnClickListener(this);
        btnsixnum.setOnClickListener(this);
        btnsevennum.setOnClickListener(this);
        btneightnum.setOnClickListener(this);
        btnninenum.setOnClickListener(this);
        btnzeronum.setOnClickListener(this);

        btnequal.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmultiple.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                displayNum += 1;
                numbertext.setText(displayNum);
                break;

            case R.id.btnTwo:
                displayNum += 2;
                numbertext.setText(displayNum);
                break;

            case R.id.btnThree:
                displayNum += 3;
                numbertext.setText(displayNum);
                break;

            case R.id.btnFour:
                displayNum += 4;
                numbertext.setText(displayNum);
                break;

            case R.id.btnFive:
                displayNum += 5;
                numbertext.setText(displayNum);
                break;

            case R.id.btnSix:
                displayNum += 6;
                numbertext.setText(displayNum);
                break;

            case R.id.btnSeven:
                displayNum += 7;
                numbertext.setText(displayNum);
                break;


            case R.id.btnEight:
                displayNum += 8;
                numbertext.setText(displayNum);
                break;


            case R.id.btnNine:
                displayNum += 9;
                numbertext.setText(displayNum);
                break;

            case R.id.btnZero:
                displayNum += 0;
                numbertext.setText(displayNum);
                break;


            case R.id.btnAdd:
                valueOne = Float.parseFloat(displayNum);
                displayNum = "";
                symbol = "+";
                break;

            case R.id.btnSubtract:
                valueOne = Float.parseFloat(displayNum);
                displayNum = "";
                symbol = "-";
                break;

            case R.id.btnDivide:
                valueOne = Float.parseFloat(displayNum);
                displayNum = "";
                symbol = "/";
                break;


            case R.id.btnMultiply:
                valueOne = Float.parseFloat(displayNum);
                displayNum = "";
                symbol = "*";
                break;


            case R.id.btnEqual:
                valueTwo = Float.parseFloat(displayNum);
                res = getResult(symbol, valueOne, valueTwo);
                numbertext.setText(String.valueOf(res));
                break;


            case R.id.btnClear:
                displayNum = "";
                numbertext.setText(displayNum);
                break;


        }
    }


    private float getResult(String symbol, float n1, float n2) {
        switch (symbol) {
            case "+":
                return n1 + n2;

            case "-":
                return n1 - n2;

            case "*":
                return n1 * n2;

            case "/":
                return n1 / n2;

            default:
                return 0;
        }
    }
}

