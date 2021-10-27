package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity2 extends Activity implements OnClickListener {

    EditText etAge;
    EditText etBirthday;

    Button btnSubmit;

    String fName, lName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etAge = (EditText) findViewById(R.id.etAge);
        etBirthday = (EditText) findViewById(R.id.etBirthday);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

        fName = getIntent().getStringExtra("fname");
        lName = getIntent().getStringExtra("lname");
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("Age", etAge.getText().toString());
        intent.putExtra("Birthday", etBirthday.getText().toString());
        intent.putExtra("fname", fName);
        intent.putExtra("lname", lName);
        startActivity(intent);
    }
}
