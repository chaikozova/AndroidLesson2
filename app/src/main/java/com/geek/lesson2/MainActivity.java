package com.geek.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        textView = findViewById(R.id.text);
        editText = findViewById(R.id.name);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Text was clicked", Toast.LENGTH_SHORT).show();
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Btn was clicked", Toast.LENGTH_LONG).show();
//                if (text.equals("Hello World!")) {
//                    textView.setText("Привет, мир!");
//                }
//                else if (text.equals("Привет, мир!")){
//                    textView.setText("Hello World!");
//                }
                    name = editText.getText().toString();
                    if (!name.equals("")) {
                        textView.setText("Hello, " + name + "!");
                    } else {
                        Toast.makeText(MainActivity.this, "Type your name", Toast.LENGTH_LONG).show();

                    }

            }
        });

    }
}