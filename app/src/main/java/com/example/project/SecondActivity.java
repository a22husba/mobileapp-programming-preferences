package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private final String key = String.valueOf(R.string.app_name);
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    sharedPreferences = getSharedPreferences(key, MODE_PRIVATE);

    button = findViewById(R.id.sendButton);
    button.setOnClickListener(new View.OnClickListener() {

        @Override
                public void onClick(View view) {
            storeUserData();
            finish();
        }
    });
    }
    private void storeUserData() {
        EditText userInputEdiText = findViewById(R.id.viewinput);
        String data = userInputEdiText.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, data);
        String key = "sharedPreferences";
        editor.apply();
    }
}
