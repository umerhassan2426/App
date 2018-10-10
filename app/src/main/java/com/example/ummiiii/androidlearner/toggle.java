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
 *
 */
public class toggle extends Fragment {


    public toggle() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_toggle, container, false);
        ImageView xml6 = (ImageView) view.findViewById(R.id.xml6);
        ImageView java6 = (ImageView) view.findViewById(R.id.java6);
        ImageView play6 = (ImageView) view.findViewById(R.id.play6);
        xml6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.toggle, new togglexml());
                fr.commit();

            }
        });
        java6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.toggle, new togglejava());
                fr.commit();

            }
        });
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.toggle, new toggleplay());
                fr.commit();

            }
        });
        return view;
    }
}
