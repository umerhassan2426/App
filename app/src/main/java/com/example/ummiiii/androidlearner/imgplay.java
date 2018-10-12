package com.example.ummiiii.androidlearner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class imgplay extends Fragment {


    public imgplay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_imgplay, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.imgplay);
        final TextView imgtxt = (TextView) view.findViewById(R.id.imgplay1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgtxt.setText(" Android Learner says.. Hello");//After clicking image view
            }
        });

        return view;
    }

}
