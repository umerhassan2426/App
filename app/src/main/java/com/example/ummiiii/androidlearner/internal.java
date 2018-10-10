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
public class internal extends Fragment {


    public internal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_internal, container, false);
        ImageView xml15 = (ImageView) view.findViewById(R.id.xml15);
        ImageView java15 = (ImageView) view.findViewById(R.id.java15);
        ImageView play15 = (ImageView) view.findViewById(R.id.play15);
        xml15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.internal_storage, new internalxml());
                fr.commit();

            }
        });
        java15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.internal_storage, new internaljava());
                fr.commit();

            }
        });
        play15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.internal_storage, new internalplay());
                fr.commit();

            }
        });
        return view;
    }

}
