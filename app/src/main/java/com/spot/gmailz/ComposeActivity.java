package com.spot.gmailz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ComposeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
       String sub = getIntent().getExtras().getString("subject");
        TextView textView = findViewById(R.id.textViewsubject);
        textView.setText(sub);
    }
}
