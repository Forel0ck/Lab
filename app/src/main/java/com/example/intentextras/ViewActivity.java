package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends Activity {

    TextView tvView;
    TextView tvView2;
    TextView tvView3;
    TextView tvView4;
    TextView tvView5;
    TextView tvView6;
    TextView tvView7;
    TextView tvView8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tvView = (TextView) findViewById(R.id.tvView);
        tvView2 = (TextView) findViewById(R.id.tvView2);
        tvView3 = (TextView) findViewById(R.id.tvView3);
        tvView4 = (TextView) findViewById(R.id.tvView4);
        tvView5 = (TextView) findViewById(R.id.tvView5);
        tvView6 = (TextView) findViewById(R.id.tvView6);
        tvView7 = (TextView) findViewById(R.id.tvView7);
        tvView8 = (TextView) findViewById(R.id.tvView8);


        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");
        String Age = intent.getStringExtra("Age");
        String Birthday = intent.getStringExtra("Birthday");
        String Country = intent.getStringExtra("Country");
        String City = intent.getStringExtra("City");
        String Email = intent.getStringExtra("Email");
        String Password = intent.getStringExtra("Password");

        tvView.setText("Your Name: " + fName );
        tvView2.setText("Surname: " + lName);
        tvView3.setText("Age: " + Age);
        tvView4.setText("Birthday: " + Birthday);
        tvView5.setText("Country: " + Country);
        tvView6.setText("City: " + City);
        tvView7.setText("Email: " + Email);
        tvView8.setText("Password: " + Password);
    }
}
