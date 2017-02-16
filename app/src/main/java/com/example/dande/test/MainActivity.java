package com.example.dande.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTest = (Button)findViewById(R.id.btn_test);
        buttonTest.setOnClickListener(startListener);
        Button ButtonMin = (Button) findViewById(R.id.btnMin);
        ButtonMin.setOnClickListener(minListener);
    }

    private View.OnClickListener startListener = new View.OnClickListener() {
        public void onClick(View v) {
            TextView tv = (TextView)findViewById(R.id.textview1);
            TextView number1 = (TextView) findViewById(R.id.nmbFirst);
            TextView number2 = (TextView) findViewById(R.id.nmbSecond);
            TextView result = (TextView) findViewById(R.id.tvResult);

            long n1 = Long.parseLong(number1.getText().toString());
            long n2 = Long.parseLong(number2.getText().toString());
            long res = n1 + n2;
            result.setText(Long.toString(res));


        }
    };
    private View.OnClickListener minListener = new View.OnClickListener(){
       public void onClick(View v){
           Intent scherm2 = new Intent(MainActivity.this,minActivity.class );
           startActivity(scherm2);
       }
    };

}
