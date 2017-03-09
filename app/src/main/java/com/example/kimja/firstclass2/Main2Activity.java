package com.example.kimja.firstclass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b1;
    EditText editText ,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

    }
    void init(){

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText = editText.getText().toString();
                String inPutText2 = editText2.getText().toString();
                final int result = Integer.parseInt(inPutText) * Integer.parseInt(inPutText2);

                Toast.makeText(getApplicationContext()
                        ,"사과의 가격은 "+result+" 원 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

    }

}
