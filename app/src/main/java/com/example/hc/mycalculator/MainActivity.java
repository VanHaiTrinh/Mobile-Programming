package com.example.hc.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private TextView t;
    private Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.editText);
        n2=(EditText)findViewById(R.id.editText2);
        t=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int num1=Integer.parseInt(n1.getText().toString());
               int num2=Integer.parseInt(n2.getText().toString());
               int sum=num1+num2;
               t.setText(Integer.toString(sum));
           }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(n1.getText().toString());
                int num2=Integer.parseInt(n2.getText().toString());
                int sub=num1-num2;
                t.setText(Integer.toString(sub));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(n1.getText().toString());
                int num2=Integer.parseInt(n2.getText().toString());
                int mul=num1*num2;
                t.setText(Integer.toString(mul));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(n1.getText().toString());
                int num2=Integer.parseInt(n2.getText().toString());
                double div=(double) num1/num2;
                t.setText(Double.toString(div));
            }
        });

    }

}
