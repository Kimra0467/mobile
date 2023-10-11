package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountString extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_string);

        EditText edittext = findViewById(R.id.csedit_input);
        Button button = findViewById(R.id.csbutton);
        TextView textview = findViewById(R.id.cstv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edittext.getText().toString(); // 버튼 클릭 시점에 텍스트 다시 가져오기
                int length = s.length();
                textview.setText(String.valueOf(length)); // 길이를 문자열로 변환하여 설정
            }
        });
    }
}
