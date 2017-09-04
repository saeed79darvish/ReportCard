package com.example.saeed.fragment_2;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saeed on 9/2/2017.
 */


public class FragmentStudentList extends ListFragment {
    List<Student> students;
    private CallBacks activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (CallBacks) getActivity();
        students = Student.SampleStudentList();
        ArrayAdapter<Student> adapter = new ArrayAdapter<Student>(getContext(), android.R.layout.simple_list_item_1, students);

        setListAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Student student=students.get(position);
        activity.onItemSelected(student);
    }

    public interface CallBacks {
        public void onItemSelected(Student student);

    }
}

