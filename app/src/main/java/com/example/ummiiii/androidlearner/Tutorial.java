package com.example.ummiiii.androidlearner;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Tutorial extends Fragment {


    public Tutorial() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tutorial, container, false);
        ImageView intro = (ImageView) view.findViewById(R.id.intro);
        ImageView basic = (ImageView) view.findViewById(R.id.basic);
        ImageView beg = (ImageView) view.findViewById(R.id.beginner);
        ImageView adv = (ImageView) view.findViewById(R.id.adv);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intro = new Intent(getActivity(),Introduction.class);
                startActivity(intro);


            }
        });
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent basic = new Intent(getActivity(),Basic.class);
                startActivity(basic);

            }
        });
        beg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent beg = new Intent(getActivity(),Beginner.class);
                startActivity(beg);



            }
        });
        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent adv = new Intent(getActivity(),Advance.class);
                startActivity(adv);

            }
        });

        return view;

    }


}
