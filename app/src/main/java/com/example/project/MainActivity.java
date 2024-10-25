package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TextView sharedresult;
    private Button button;
    private final String key = String.valueOf("viewData");
    private SharedPreferences myPreferenceREf;
    private SharedPreferences.Editor myPreferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button = findViewById(R.id.sendButton);
        sharedresult = findViewById(R.id.textViewAccount);

        myPreferenceREf = getPreferences(MODE_PRIVATE);
        myPreferenceEditor = myPreferenceREf.edit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity;
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("a22husba", "startActivity");
        String defaultValue ="Nothing shared yet";
        SharedPreferences sharedPref = getSharedPreferences(key, MODE_PRIVATE);
        sharedresult.setText(sharedPref.getString(key, defaultValue));
    }



}
