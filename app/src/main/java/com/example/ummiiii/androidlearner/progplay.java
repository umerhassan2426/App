package com.example.ummiiii.androidlearner;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class progplay extends Fragment {
    Button login;
    ProgressBar progress;


    public progplay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_progplay, container, false);
        login = (Button)view.findViewById(R.id.login3);
        progress = (ProgressBar) view.findViewById(R.id.progress);
        return view;
    }
    public void loginProgress(View view){
        progress.setVisibility(View.VISIBLE);
        Toast.makeText(getActivity(),"Sucessfully logged in",Toast.LENGTH_LONG).show();
    }
}
