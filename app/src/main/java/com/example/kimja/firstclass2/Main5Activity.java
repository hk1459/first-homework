package com.example.kimja.firstclass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText editText ,editText2,editText3;
    Button b1;
    TextView textView8,textView10,textView11,textView12;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        setTitle("레스토랑 메뉴 주문");
        init();

    }
    void init(){
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        b1 = (Button)findViewById(R.id.b1);
        textView11 = (TextView)findViewById(R.id.textView11);
        textView12 = (TextView)findViewById(R.id.textView12);
        checkBox = (CheckBox)findViewById(R.id.checkBox) ;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText = editText.getText().toString();
                String inPutText2 = editText2.getText().toString();
                String inPutText3 = editText3.getText().toString();
                final int result,number;
                if (checkBox.isChecked()){
                    result = (Integer.parseInt(inPutText)*15000
                            + Integer.parseInt(inPutText2)*13000 +Integer.parseInt(inPutText3)*9000)*9/10;
                    number = Integer.parseInt(inPutText)
                            +Integer.parseInt(inPutText2)+Integer.parseInt(inPutText3);
                    textView11.setText(number +"개");
                    textView12.setText(result +"원");
                }else{
                    result = Integer.parseInt(inPutText)*15000
                            + Integer.parseInt(inPutText2)*13000 +Integer.parseInt(inPutText3)*9000;
                    number = Integer.parseInt(inPutText)
                            +Integer.parseInt(inPutText2)+Integer.parseInt(inPutText3);
                    textView11.setText(number +"개");
                    textView12.setText(result +"원");
                }
            }
        });


    }
}
