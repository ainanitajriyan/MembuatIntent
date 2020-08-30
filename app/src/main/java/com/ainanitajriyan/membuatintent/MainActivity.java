package com.ainanitajriyan.membuatintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button btnPutExtra;
    public Button btnExplicit;
    public Button btnImplicit;
    public Button btnDialNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPutExtra = (Button)findViewById(R.id.intentputextra);
        btnPutExtra.setOnClickListener(this);
        btnExplicit = (Button)findViewById(R.id.explicitintent);
        btnExplicit.setOnClickListener(this);
        btnImplicit = (Button)findViewById(R.id.implicitintent);
        btnImplicit.setOnClickListener(this);
        btnDialNumber = (Button)findViewById(R.id.btndialnumber);
        btnDialNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.intentputextra:
                Intent putextra = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(putextra);
                break;
            case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/ainanitajriyan_"));
                startActivity(implicit);
                break;
            case R.id.btndialnumber:
                String phonenumber = "082120524105";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phonenumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}