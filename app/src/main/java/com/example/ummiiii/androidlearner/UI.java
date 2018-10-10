package com.example.ummiiii.androidlearner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//UI Controls file

/**
 * A simple {@link Fragment} subclass.
 */
public class UI extends Fragment {


    public UI() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ui, container, false);

        TextView textview =(TextView) view.findViewById(R.id.widgets1);
        TextView edit =(TextView) view.findViewById(R.id.widgets2);
        TextView auto =(TextView) view.findViewById(R.id.widgets3);
        TextView btn =(TextView) view.findViewById(R.id.widgets4);
        TextView img =(TextView) view.findViewById(R.id.widgets5);
        TextView checkbox =(TextView) view.findViewById(R.id.widgets6);
        TextView toggle =(TextView) view.findViewById(R.id.widgets7);
        TextView radio =(TextView) view.findViewById(R.id.widgets8);
        TextView spinner =(TextView) view.findViewById(R.id.widgets9);
        TextView progress =(TextView) view.findViewById(R.id.widgets10);
        TextView time =(TextView) view.findViewById(R.id.widgets11);
        TextView date =(TextView) view.findViewById(R.id.widgets12);
        TextView intents =(TextView) view.findViewById(R.id.widgets13);
        TextView frags =(TextView) view.findViewById(R.id.widgets14);


        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new textview());
                fr.commit();

            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new edit());
                fr.commit();

            }
        });
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new autotext());
                fr.commit();

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new button());
                fr.commit();

            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new image());
                fr.commit();

            }
        });
        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new check());
                fr.commit();

            }
        });
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new toggle());
                fr.commit();

            }
        });
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new radio());
                fr.commit();

            }
        });
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new spinner());
                fr.commit();

            }
        });
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new progress());
                fr.commit();

            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new time());
                fr.commit();

            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new date());
                fr.commit();

            }
        });

        intents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new intent());
                fr.commit();

            }
        });
        frags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_uicontrols,new frag());
                fr.commit();

            }
        });



        return view;
    }

}
