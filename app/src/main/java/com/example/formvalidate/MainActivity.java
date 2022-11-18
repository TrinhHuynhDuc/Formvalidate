package com.example.formvalidate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get
        EditText e1, e2, e3,e4,e5;
        e1 = (EditText) findViewById(R.id.textInput1);
        e2 = (EditText) findViewById(R.id.textInput2);
        e3 = (EditText) findViewById(R.id.textInput3);
        e4 = (EditText) findViewById(R.id.textInput4);
        e5 = (EditText) findViewById(R.id.textInput5);

        Button dk = (Button) findViewById(R.id.dk);

        dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();

                RadioButton radio1 = (RadioButton) findViewById(R.id.radio_a);
                RadioButton radio2 = (RadioButton) findViewById(R.id.radio_b);
                TextView gender = (TextView) findViewById(R.id.gender);
                CheckBox agree = (CheckBox) findViewById(R.id.agree);
                TextView agreetext = (TextView) findViewById(R.id.textagree);

                e1.setBackgroundColor(Color.WHITE);
                e2.setBackgroundColor(Color.WHITE);
                e3.setBackgroundColor(Color.WHITE);
                e4.setBackgroundColor(Color.WHITE);
                e5.setBackgroundColor(Color.WHITE);
                gender.setBackgroundColor(Color.WHITE);
                agreetext.setBackgroundColor(Color.WHITE);
                if(s1.equals("")){
                    Toast.makeText(MainActivity.this,"Trường này không được trống",Toast.LENGTH_LONG).show();
                    e1.setBackgroundColor(Color.RED);
                }
                else if(s2.equals("")){
                    Toast.makeText(MainActivity.this,"Trường này không được để trống",Toast.LENGTH_LONG).show();
                    e2.setBackgroundColor(Color.RED);
                }
                else if((radio1.isChecked()==false) && (radio2.isChecked()==false)){
                    Toast.makeText(MainActivity.this,"Chưa chọn giới tính",Toast.LENGTH_LONG).show();
                    gender.setBackgroundColor(Color.RED);
                }
                else if(s3.equals("")){
                    Toast.makeText(MainActivity.this,"Trường này không được để trống",Toast.LENGTH_LONG).show();
                    e3.setBackgroundColor(Color.RED);
                }
                else if(s4.equals("")){
                    Toast.makeText(MainActivity.this,"Trường này không được để trống",Toast.LENGTH_LONG).show();
                    e4.setBackgroundColor(Color.RED);
                }
                else if(s5.equals("")){
                    Toast.makeText(MainActivity.this,"Trường này không được để trống",Toast.LENGTH_LONG).show();
                    e5.setBackgroundColor(Color.RED);
                }
                else if((agree.isChecked()==false)){
                    Toast.makeText(MainActivity.this,"Bạn phải đồng ý",Toast.LENGTH_LONG).show();
                    agreetext.setBackgroundColor(Color.RED);
                }
                else{
                    Toast.makeText(MainActivity.this,"Đăng ký thành công",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}