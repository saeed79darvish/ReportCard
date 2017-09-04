package com.example.saeed.fragment_2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentDetailsActivity extends AppCompatActivity {

    FragmentStudentDetails fragment;
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        student=getIntent().getParcelableExtra("student");
        fragment=FragmentStudentDetails.newInstance(student.Id,student.Name,student.Score);
        ;
        getSupportFragmentManager().beginTransaction().replace(R.id.Details_Fragment_Activity,fragment)
                .commit();
    }
}
