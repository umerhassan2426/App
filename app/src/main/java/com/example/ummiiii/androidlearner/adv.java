package com.example.ummiiii.androidlearner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class adv extends Fragment {


    public adv() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adv, container, false);
        TextView share =(TextView) view.findViewById(R.id.adv1);
        TextView internal =(TextView) view.findViewById(R.id.adv2);
        TextView external =(TextView) view.findViewById(R.id.adv3);
        TextView sqlite =(TextView) view.findViewById(R.id.adv4);
        TextView notifi =(TextView) view.findViewById(R.id.adv5);
        TextView webview =(TextView) view.findViewById(R.id.adv6);


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_advance,new share());
                fr.commit();

            }
        });
        internal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_advance,new internal());
                fr.commit();

            }
        });
        external.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_advance,new external());
                fr.commit();

            }
        });
        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_advance,new sql());
                fr.commit();

            }
        });
        notifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_advance,new notifi());
                fr.commit();

            }
        });
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_advance,new webview());
                fr.commit();

            }
        });
        return view;
    }

}
