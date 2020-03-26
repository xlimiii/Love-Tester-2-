package com.liminimi.lovetester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton addBtn = (ImageButton) findViewById(R.id.buttontest);
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.name1);
                EditText secondNumEditText = (EditText) findViewById(R.id.name2);
                TextView resultTextView = (TextView) findViewById(R.id.result);




                char[] n1 = (((firstNumEditText.getText().toString()).toUpperCase()).toCharArray());
                char[] n2 = ((secondNumEditText.getText().toString())).toUpperCase().toCharArray();
int resultnum = 0;
for (int i =0; i<n1.length;i++)
    resultnum = resultnum + n1[i];
for (int i=0; i<n2.length;i++)
    resultnum = resultnum + n2[i];
resultnum = resultnum + 37;
resultnum = resultnum%101;

                resultTextView.setText(resultnum + "%");

            }

        });

    }
}
