package com.example.jonathanchirwa.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View v){

        EditText dollarAmount = (EditText) findViewById(R.id.amount);
        Log.i("Amount",dollarAmount.getText().toString());
        Log.i("Info","Button pressed");
        Double amountDouble = Double.parseDouble(dollarAmount.getText().toString());
        Double mkwAmount = amountDouble * 571.36;
        Toast.makeText(MainActivity.this, String.format("%.2f",amountDouble)+" CAD = "+String.format("%.2f",mkwAmount)+" MKW",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
