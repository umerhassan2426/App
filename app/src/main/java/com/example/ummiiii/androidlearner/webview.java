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
public class webview extends Fragment {


    public webview() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_webview, container, false);
        ImageView xml19 = (ImageView) view.findViewById(R.id.xml19);
        ImageView java19 = (ImageView) view.findViewById(R.id.java19);
        ImageView play19 = (ImageView) view.findViewById(R.id.play19);
        xml19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.web_change, new webxml());
                fr.commit();

            }
        });
        java19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.web_change, new webjava());
                fr.commit();

            }
        });
        play19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.web_change, new webplay());
                fr.commit();

            }
        });
        return view;
    }
    }

