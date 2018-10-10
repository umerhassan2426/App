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
public class basicconcept extends Fragment {


    public basicconcept() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_basicconcept, container, false);
        TextView lifecycle =(TextView) view.findViewById(R.id.basic3);
        TextView intent =(TextView) view.findViewById(R.id.basic4);
        TextView views =(TextView) view.findViewById(R.id.basic1);
        TextView layouts =(TextView) view.findViewById(R.id.basic2);
        TextView frag =(TextView) view.findViewById(R.id.basic5);
        TextView Ui =(TextView) view.findViewById(R.id.basic6);
        TextView event =(TextView) view.findViewById(R.id.basic7);
        TextView toast =(TextView) view.findViewById(R.id.basic8);
        TextView adapter =(TextView) view.findViewById(R.id.basic9);
        TextView listview =(TextView) view.findViewById(R.id.basic10);
        TextView shared =(TextView) view.findViewById(R.id.basic12);
        TextView internl =(TextView) view.findViewById(R.id.basic13);
        TextView Sql =(TextView) view.findViewById(R.id.basic14);
        TextView json =(TextView) view.findViewById(R.id.basic16);

        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new activitylifecycle());
                fr.commit();

            }
        });
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new Intents());
                fr.commit();

            }
        });
        views.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new Views());
                fr.commit();

            }
        });
        layouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new Layouts());
                fr.commit();

            }
        });
        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new androidfragments());
                fr.commit();

            }
        });
        Ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new UIControls());
                fr.commit();

            }
        });
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new eventhandling());
                fr.commit();

            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new toast());
                fr.commit();

            }
        });
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new adapter());
                fr.commit();

            }
        });
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new listview());
                fr.commit();

            }
        });

        shared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new Shared());
                fr.commit();

            }
        });
        internl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new Internal_external());
                fr.commit();

            }
        });
        Sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new Sqlite());
                fr.commit();

            }
        });

        json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_change,new json());
                fr.commit();

            }
        });
        return view;
    }

}
