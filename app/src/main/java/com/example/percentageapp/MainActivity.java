package com.example.percentageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numberTextView;
    EditText percentageEditText;
    EditText numberEdittext;
    Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberTextView = findViewById(R.id.numberTextView);
        percentageEditText = findViewById(R.id.percentageView);
        numberEdittext = findViewById(R.id.numberView);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float percentage = Float.parseFloat(percentageEditText.getText().toString());
                float dec = percentage / 100;
                float total = dec * Float.parseFloat(numberEdittext.getText().toString());
                numberTextView.setText(Float.toString(total));
            }
        });
    }
}
