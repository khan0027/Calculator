package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button btn_twozero;
    Button btn_zero;
    Button btn_decimal;
    Button btn_equal;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_add;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_sub;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_mul;
    Button btn_clear;
    Button btn_allclear;
    ImageButton btn_edit;
    Button btn_div;
    TextView main_text;
    TextView result_text;

    public String maintext = "";
    private String resulttext = "";
    private char operator;
    private int len = 0;
    private int decimal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_decimal = findViewById(R.id.btn_decimal);
        btn_clear = findViewById(R.id.btn_clear);
        btn_allclear = findViewById(R.id.btn_allclear);
        btn_edit = findViewById(R.id.btn_edit);
        //all operators are here
        btn_equal = findViewById(R.id.btn_equal);
        btn_add = findViewById(R.id.btn_add);
        btn_mul = findViewById(R.id.btn_mul);
        btn_sub = findViewById(R.id.btn_sub);
        btn_div = findViewById(R.id.btn_div);
        //all numerical buttons are here
        btn_twozero = findViewById(R.id.btn_twozero);
        btn_zero = findViewById(R.id.btn_zero);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        //text views
        main_text = findViewById(R.id.main_text);
        result_text = findViewById(R.id.result_text);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maintext = "";
                main_text.setText("0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "1";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "2";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "3";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "4";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "5";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "6";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "7";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "7";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "8";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(maintext.length() <= 6){
                    maintext += "9";
                    main_text.setText(maintext);
                }
                else {
                    Toast.makeText(MainActivity.this, "Length increased", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(maintext, "")){
//                    Toast.makeText(MainActivity.this, "already zero", Toast.LENGTH_SHORT).show();
                        main_text.setText("0");
                }
                else
                {
                    maintext += "0";
                    main_text.setText(maintext);
                }
            }
        });
        btn_twozero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(maintext, "")){
//                    Toast.makeText(MainActivity.this, "already zero", Toast.LENGTH_SHORT).show();
                    main_text.setText("0");
                }
                else
                {
                    maintext += "00";
                    main_text.setText(maintext);
                }
            }
        });
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = maintext;
                if(Objects.equals(st, "")){
                    Toast.makeText(MainActivity.this, "Nothing to delete", Toast.LENGTH_SHORT).show();
                }else {
                    maintext = st.substring(0,st.length()-1);
                    main_text.setText(maintext);
                }


            }
        });

        //Operations are handled here

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '+';
                maintext += "+";
                main_text.setText(maintext);
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '-';
                maintext += "-";
                main_text.setText(maintext);
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '*';
                maintext += "x";
                main_text.setText(maintext);
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = '/';
                maintext += "/";
                main_text.setText(maintext);
            }
        });
        btn_decimal.setOnClickListener(v -> {
            if(decimal == 0){
                maintext += ".";
                main_text.setText(maintext);
                decimal = 1;
            }


        });
        btn_equal.setOnClickListener(v ->{
            switch (operator){
                case '+':

            }
        });


    }
}