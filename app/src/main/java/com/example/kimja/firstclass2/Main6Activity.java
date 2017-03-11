package com.example.kimja.firstclass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText editText1 ,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");

        init();

    }
    void init(){
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText1 = editText1.getText().toString();
                String inPutText2 = editText2.getText().toString();
                if (inPutText1.getBytes().length <= 0 ||inPutText2.getBytes().length <= 0 ){
                    Toast.makeText(getApplicationContext()
                            ,"값을 입력하세요."
                            ,Toast.LENGTH_SHORT).show();
                } else{
                    final int result = Integer.parseInt(inPutText1) + Integer.parseInt(inPutText2);
                    Toast.makeText(getApplicationContext()
                            ,"더하기 계산 결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText1 = editText1.getText().toString();
                String inPutText2 = editText2.getText().toString();
                if (inPutText1.getBytes().length <= 0 ||inPutText2.getBytes().length <= 0 ){
                    Toast.makeText(getApplicationContext()
                            ,"값을 입력하세요."
                            ,Toast.LENGTH_SHORT).show();
                } else {
                    final int result = Integer.parseInt(inPutText1) - Integer.parseInt(inPutText2);
                    Toast.makeText(getApplicationContext()
                            ,"빼기 계산 결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText1 = editText1.getText().toString();
                String inPutText2 = editText2.getText().toString();
                if (inPutText1.getBytes().length <= 0 ||inPutText2.getBytes().length <= 0 ){
                    Toast.makeText(getApplicationContext()
                            ,"값을 입력하세요."
                            ,Toast.LENGTH_SHORT).show();
                } else {
                    final int result = Integer.parseInt(inPutText1) * Integer.parseInt(inPutText2);
                    Toast.makeText(getApplicationContext()
                            ,"곱하기 계산 결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText1 = editText1.getText().toString();
                String inPutText2 = editText2.getText().toString();
                if (inPutText1.getBytes().length <= 0 ||inPutText2.getBytes().length <= 0 ){
                    Toast.makeText(getApplicationContext()
                            ,"값을 입력하세요."
                            ,Toast.LENGTH_SHORT).show();
                } else {
                    final int result,result2;
                    if(Integer.parseInt(inPutText1) == 0 || Integer.parseInt(inPutText2) == 0){
                        Toast.makeText(getApplicationContext()
                                ,"0은 나눌수 없습니다. 값을 다시 입력하세요."
                                ,Toast.LENGTH_SHORT).show();
                    } else if(Integer.parseInt(inPutText1) >= Integer.parseInt(inPutText2)){
                        result = Integer.parseInt(inPutText1) / Integer.parseInt(inPutText2);
                        result2 = Integer.parseInt(inPutText1) % Integer.parseInt(inPutText2);
                        Toast.makeText(getApplicationContext()
                                ,"나누기 계산 결과는 "+result+ "이고 나머지는" + result2 +"입니다."
                                ,Toast.LENGTH_SHORT).show();
                    } else{
                        result = Integer.parseInt(inPutText2) / Integer.parseInt(inPutText1);
                        result2 = Integer.parseInt(inPutText1) % Integer.parseInt(inPutText2);
                        Toast.makeText(getApplicationContext()
                                ,"나누기 계산 결과는 "+result+ "이고 나머지는" + result2 +"입니다."
                                ,Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
