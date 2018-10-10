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
public class sql extends Fragment {


    public sql() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sql, container, false);
        ImageView xml17 = (ImageView) view.findViewById(R.id.xml17);
        ImageView java17 = (ImageView) view.findViewById(R.id.java17);
        ImageView play17 = (ImageView) view.findViewById(R.id.play17);
        xml17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.sql_change, new sqlxml());
                fr.commit();

            }
        });
        java17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.sql_change, new sqljava());
                fr.commit();

            }
        });
        play17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.sql_change, new sqlplay());
                fr.commit();

            }
        });
        return view;
    }

}
