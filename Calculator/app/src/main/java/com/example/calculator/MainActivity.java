package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText e1,e2;
TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextText);
        e2 = findViewById(R.id.editTextText2);
        tv = findViewById(R.id.textView);


    }

    public void Add(View view){
       float n1 =  Float.parseFloat(e1.getText().toString());
        float n2 = Float.parseFloat(e2.getText().toString());
        float n3 = n1+ n2;
        tv.setText(""+n3);

    }

    public void Sub(View view){
        float n1 =Float.parseFloat(e1.getText().toString());
        float n2= Float.parseFloat(e2.getText().toString());
        float n3 = n1-n2;
        tv.setText(""+ n3);
    }

    public void Mul(View view){
        float n1 = Float.parseFloat(e1.getText().toString());
        float n2 = Float.parseFloat(e1.getText().toString());
        float n3 = n1*n2;
        tv.setText(""+ n3);
    }

    public void Div(View view){
        float n1 = Float.parseFloat(e1.getText().toString());
        float n2 = Float.parseFloat(e2.getText().toString());
        float n3 = n1/n2;
        tv.setText(""+ n3);
    }

    public void Per(View view){
//        float num = Float.parseFloat(tv.getText().toString());
//        float per = num/100;
//        tv.setText("" + per);



        if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()){
            if(!e1.getText().toString().isEmpty()){
                float n1 = Float.parseFloat(e1.getText().toString());
                float per =n1/100;
                tv.setText("" + per);
            }else{
                float n2 = Float.parseFloat(e2.getText().toString());
                float per =n2/100;
                tv.setText("" + per);
            }
        }
        else{
            float res = (Float.parseFloat(tv.getText().toString()))/100;
            tv.setText(""+ res);
        }

    }

    public void Reset(View view){
        float n3 = 0;
        tv.setText(""+n3 );
    }




}