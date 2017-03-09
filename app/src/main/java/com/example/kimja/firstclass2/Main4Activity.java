package com.example.kimja.firstclass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button b1,b2;
    EditText editText ,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("온도변환기");

        init();
    }
    void init(){

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText = editText.getText().toString();
                double result = Double.parseDouble(inPutText)*1.8 + 32.0;
                Toast.makeText(getApplicationContext()
                        ,"화씨 온도는 "+result+"도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText2 = editText2.getText().toString();
                double result = (Double.parseDouble(inPutText2)-32.0)/1.8;
                Toast.makeText(getApplicationContext()
                        ,"섭씨 온도는 " +result+"도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

