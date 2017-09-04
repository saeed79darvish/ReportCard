package com.example.saeed.fragment_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by saeed on 9/1/2017.
 */

public class FragmentStudentDetails extends Fragment {
    TextView tvid,tvname,tvscore;

    public static FragmentStudentDetails newInstance(String id,String name,int score) {
        
        Bundle args = new Bundle();
        
        FragmentStudentDetails fragment = new FragmentStudentDetails();
        args.putString("Id",id);
        args.putString("Name",name);
        args.putInt("Score",score);
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fregment_student_details,container,false);
        tvid=rootView.findViewById(R.id.tv_student_id);
        tvname=rootView.findViewById(R.id.tv_student_name);
        tvscore=rootView.findViewById(R.id.tv_student_score);

        tvid.setText(getArguments().getString("Id"));
        tvname.setText(getArguments().getString("Name"));
        tvscore.setText(String.valueOf(getArguments().getInt("Score")));
        return rootView;
    }
}
