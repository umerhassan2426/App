package com.example.ummiiii.androidlearner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class external extends Fragment {


    public external() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_external, container, false);
        ImageView xml16 = (ImageView) view.findViewById(R.id.xml16);
        ImageView java16 = (ImageView) view.findViewById(R.id.java16);
        ImageView play16 = (ImageView) view.findViewById(R.id.play16);
        xml16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.external_change, new externalxml());
                fr.commit();

            }
        });
        java16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.external_change, new externaljava());
                fr.commit();

            }
        });
        play16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.external_change, new externalplay());
                fr.commit();

            }
        });
        return view;
    }

}
