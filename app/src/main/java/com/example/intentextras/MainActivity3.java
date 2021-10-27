package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity3 extends Activity implements OnClickListener {

    EditText etCountry;
    EditText etCity;

    Button btnSubmit;

    String fName, lName, Age, Birthday;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etCountry = (EditText) findViewById(R.id.etCountry);
        etCity = (EditText) findViewById(R.id.etCity);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        fName = getIntent().getStringExtra("fname");
        lName = getIntent().getStringExtra("lname");
        Age =  getIntent().getStringExtra("Age");
        Birthday = getIntent().getStringExtra("Birthday");

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        intent.putExtra("Country", etCountry.getText().toString());
        intent.putExtra("City", etCity.getText().toString());
        intent.putExtra("fname", fName);
        intent.putExtra("lname", lName);
        intent.putExtra("Age", Age);
        intent.putExtra("Birthday", Birthday);
        startActivity(intent);
    }
}

