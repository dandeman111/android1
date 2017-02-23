package com.example.dande.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class minActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btnMin = (Button) findViewById(R.id.btnGo);
        btnMin.setOnClickListener(minListener1);

    }

    private View.OnClickListener minListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView tvEen = (TextView) findViewById(R.id.tvEen);
            TextView tvTwee = (TextView) findViewById(R.id.tvTwee);
            TextView tv1 = (TextView) findViewById(R.id.tvRes);

            long n1 = Long.parseLong(tvEen.getText().toString());
            long n2 = Long.parseLong(tvTwee.getText().toString());
            long res = n1 - n2;
            tv1.setText(Long.toString(res));

        }
    };


}
