package com.ainanitajriyan.membuatintent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnHello;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        btnHello = (Button)findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        tvResult = (TextView)findViewById(R.id.tv_result);
    }

    public void onClick(View v){
        if(v.getId() == R.id.btnHello){
            tvResult.setText(String.format("Hello Ainan!"));
        }
    }
}
