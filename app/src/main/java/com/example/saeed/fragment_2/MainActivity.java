package com.example.saeed.fragment_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentStudentList.CallBacks {
    FragmentStudentList fragmentStudentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentStudentList fragmentStudentList=new FragmentStudentList();
        getSupportFragmentManager().beginTransaction().


        replace(R.id.ListFragment_Container,fragmentStudentList)
                .commit();

    }

    @Override
    public void onItemSelected(Student student) {
        Intent intent=new Intent(this,StudentDetailsActivity.class).putExtra("student",student);
        startActivity(intent);

    }


}

