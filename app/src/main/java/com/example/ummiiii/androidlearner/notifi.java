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
public class notifi extends Fragment {


    public notifi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifi, container, false);
        ImageView xml18 = (ImageView) view.findViewById(R.id.xml18);
        ImageView java18 = (ImageView) view.findViewById(R.id.java18);
        ImageView play18 = (ImageView) view.findViewById(R.id.play18);
        xml18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.notifi_change, new notifixml());
                fr.commit();

            }
        });
        java18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.notifi_change, new notifijava());
                fr.commit();

            }
        });
        play18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.notifi_change, new notifiplay());
                fr.commit();

            }
        });
        return view;
    }

}
