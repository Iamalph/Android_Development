package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public class Number {
        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)){
                return true;
            }else{

                return false;
            }

        }


        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber <number){
                x++;
                triangularNumber = triangularNumber + x;

            }

            if(triangularNumber == number){
                return true;
            }else{
                return false;
            }
        }
    }




    public void testNumber(View view){



    Log.i("Info", "button pressed");
    EditText editText = (EditText)findViewById(R.id.editTextNumber);
        String message = "";
if(editText.getText().toString().isEmpty()){
    message += " Please Enter a number";
}else if(Integer.parseInt(editText.getText().toString())<0){
    message+= "please enter a positive number";
}

else{

    Number myNumber = new Number();
    myNumber.number = Integer.parseInt(editText.getText().toString());
    message = editText.getText().toString();
    if(myNumber.isSquare() && myNumber.isTriangular()){
        message +=  " is square and triangulare";

    }
    else if(myNumber.isSquare()){
        message += " is square but not triangular";
    }
    else if(myNumber.isTriangular()){
        message += " is triangulare but not square";
    }else{
        message +=  " neither triangular nor square";
    }
}

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}