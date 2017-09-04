package com.example.saeed.fragment_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Toast;

/**
 * Created by saeed on 9/1/2017.
 */

public class MyFragment extends Fragment {
    EditText inputemail;
    Button btnsubmit;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        inputemail= rootView.findViewById(R.id.input_email);
        btnsubmit=rootView.findViewById(R.id.btn_submit);
        inputemail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String email=charSequence.toString().trim();
                if (email.isEmpty()||!email.contains("@")||email.indexOf("@")==0||email.indexOf(".")==0||email.indexOf("@")>email.indexOf(".")||email.length()<5||email.split("@").length !=2||email.startsWith("@")||email.endsWith("@")||email.startsWith(".")|| email.endsWith(".")) {
                    btnsubmit.setEnabled(false);

                }else {
                    btnsubmit.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }


        });
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=inputemail.getText().toString().trim();
                Toast.makeText(getContext(),"email: \n"+email,Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}