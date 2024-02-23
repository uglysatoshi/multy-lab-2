package com.example.multy_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        textView.setText("");
        button.setOnClickListener(view -> {
            if (!editText.getText().toString().isEmpty()) {
                textView.setText(String.format("Привет, %s!", editText.getText().toString()));
            } else {
                textView.setText("Сперва введите имя!");
            }
        });
    }
}