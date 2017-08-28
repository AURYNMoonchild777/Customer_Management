package com.bignerdranch.android.customer_management;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.EditText;

import android.view.View;
import android.widget.Toast;





public class TrainerActivity extends AppCompatActivity {

    Button b1, b2;
    EditText ed1, ed2;

    TextView tx1;

    EditText jdoe = (EditText) findViewById(R.id.editText);
    EditText welcome1 = (EditText) findViewById(R.id.editText2);

    private static final String TAG = "TrainerActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");


        setContentView(R.layout.activity_trainer);
        b1 = (Button)findViewById(R.id.button);

        ed1 = (EditText)findViewById(R.id.editText);

        ed2 = (EditText)findViewById(R.id.editText2);

        b2 = (Button)findViewById(R.id.button2);



        tx1 = (TextView)findViewById(R.id.textview);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("jdoe") &&
                        ed2.getText().toString().equals("welcome1")) {
                    Toast.makeText(getApplicationContext(),
                            "Login successful!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Login unsuccessful.",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

