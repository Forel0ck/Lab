package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity4 extends Activity implements OnClickListener {

    EditText etEmail;
    EditText etPassword;

    Button btnSubmit;

    String fName, lName, Age, Birthday, Country, City;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        fName = getIntent().getStringExtra("fname");
        lName = getIntent().getStringExtra("lname");
        Age =  getIntent().getStringExtra("Age");
        Birthday = getIntent().getStringExtra("Birthday");
        Country = getIntent().getStringExtra("Country");
        City = getIntent().getStringExtra("City");

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("Email", etEmail.getText().toString());
        intent.putExtra("Password", etPassword.getText().toString());
        intent.putExtra("fname", fName);
        intent.putExtra("lname", lName);
        intent.putExtra("Age", Age);
        intent.putExtra("Birthday", Birthday);
        intent.putExtra("Country", Country);
        intent.putExtra("City", City);
        startActivity(intent);
    }
}

