package com.example.kimja.firstclass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;
    EditText editText ,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이 계산기");
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
                final int result = 2017 - Integer.parseInt(inPutText) + 1;
                Toast.makeText(getApplicationContext()
                        ,"당신의 나이는 "+result+"세 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText2 = editText2.getText().toString();
                final int result = 2017 - Integer.parseInt(inPutText2) + 1;
                Toast.makeText(getApplicationContext()
                        ,"당신의 태어난 해는 " +result+"년 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
