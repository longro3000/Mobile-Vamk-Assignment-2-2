package com.example.assignment22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button submitBtn, resetBtn;
    EditText lastName, firstName, phoneNumber, comments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastName = (EditText)findViewById(R.id.lastName);
        firstName = (EditText)findViewById(R.id.firstName);
        phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        comments = (EditText) findViewById(R.id.comments);
        submitBtn = (Button) findViewById(R.id.submitBtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        ImageView logoView=(ImageView) findViewById(R.id.imageView);
        logoView.setImageResource(R.drawable.logo);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.onResetButtonClick();
            }
        });
    }

    protected void onResetButtonClick() {
        lastName.setText("");
        firstName.setText("");
        phoneNumber.setText("");
        comments.setText("");
    }
}
