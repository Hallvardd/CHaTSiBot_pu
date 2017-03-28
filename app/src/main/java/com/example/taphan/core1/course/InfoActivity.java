package com.example.taphan.core1.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.taphan.core1.R;
import com.example.taphan.core1.login.LoginActivity;

/**
 * Created by Charles on 23.03.2017.
 */

public class InfoActivity extends AppCompatActivity{

    private Button signOutButton;
    private Button addCourseButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        addCourseButton = (Button) findViewById(R.id.add_course);
        signOutButton = (Button) findViewById(R.id.sign_out);

        addCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(InfoActivity.this, AddCourseActivity.class);
                startActivity(intent);
            }
        });


        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(InfoActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }


}
