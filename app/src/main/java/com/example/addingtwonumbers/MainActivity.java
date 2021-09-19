package com.example.addingtwonumbers;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button sum, diff, prod, divi;
    private TextView result;
    private EditText number1, number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = findViewById(R.id.add);
        diff = findViewById(R.id.subtract);
        prod = findViewById(R.id.multiply);
        divi = findViewById(R.id.divide);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String s1 = number1.getText().toString();
                String s2 = number2.getText().toString();
                double x = Double.parseDouble(s1);
                double y = Double.parseDouble(s2);

                double r = x+y;
                result.setText(new StringBuilder().append("The result is : ").append(r).toString());
            }
        });

        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String s1 = number1.getText().toString();
                String s2 = number2.getText().toString();
                double x = Double.parseDouble(s1);
                double y = Double.parseDouble(s2);

                double r = x-y;
                result.setText(new StringBuilder().append("The result is : ").append(r).toString());
            }
        });

        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String s1 = number1.getText().toString();
                String s2 = number2.getText().toString();
                double x = Double.parseDouble(s1);
                double y = Double.parseDouble(s2);

                double r = x*y;
                result.setText(new StringBuilder().append("The result is : ").append(r).toString());
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String s1 = number1.getText().toString();
                String s2 = number2.getText().toString();
                double x = Double.parseDouble(s1);
                double y = Double.parseDouble(s2);

                double r = x/y;
                result.setText(new StringBuilder().append("The result is : ").append(r).toString());
            }
        });



    }
}