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
public class intent extends Fragment {


    public intent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intent, container, false);

        ImageView xml12 = (ImageView) view.findViewById(R.id.xml12);
        ImageView java12 = (ImageView) view.findViewById(R.id.java12);
        ImageView play12 = (ImageView) view.findViewById(R.id.play12);
        xml12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.change_intent, new intentxml());
                fr.commit();

            }
        });
        java12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.change_intent, new intentjava());
                fr.commit();

            }
        });
        play12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.change_intent, new intentplay());
                fr.commit();

            }
        });
        return view;
    }

}
