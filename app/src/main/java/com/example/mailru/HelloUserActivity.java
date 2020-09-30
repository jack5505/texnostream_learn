package com.example.mailru;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class HelloUserActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_user);
        EditText editText = findViewById(R.id.edit);
        Button btn = findViewById(R.id.btn);
        TextView textView = findViewById(R.id.output);

        textView.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(e ->{
            textView.setText(editText.getText());
            textView.setVisibility(View.VISIBLE);
        });
    }
}
