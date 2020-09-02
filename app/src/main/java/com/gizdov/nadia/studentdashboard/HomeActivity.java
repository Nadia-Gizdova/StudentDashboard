package com.gizdov.nadia.studentdashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gizdov.nadia.studentdashboard.ui.login.LoginActivity;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button studentsButton = findViewById(R.id.studentsButton);
        final Button coursesButton = findViewById(R.id.coursesButton);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String userId = intent.getStringExtra(LoginActivity.USERID);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText("Welcome, "+userId+"!");
        studentsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), StudentsActivity.class);
                startActivity(intent);
            }
        });
        coursesButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CoursesActivity.class);
                startActivity(intent);
            }
        });
    }
}