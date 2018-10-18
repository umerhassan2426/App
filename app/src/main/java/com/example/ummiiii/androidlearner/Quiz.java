package com.example.ummiiii.androidlearner;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Quiz extends Fragment {


    public Quiz() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        ImageView quizy = (ImageView) view.findViewById(R.id.quizy1);
        ImageView beginner = (ImageView) view.findViewById(R.id.begquiz);
        ImageView adv = (ImageView) view.findViewById(R.id.advquiz);
        ImageView intr = (ImageView) view.findViewById(R.id.interview);

        quizy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BasicQuiz.class);
                startActivity(intent);


            }
        });


        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),BeginnerQuiz.class);
                startActivity(intent);


            }
        });

        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AdvanceQuiz.class);
                startActivity(intent);

            }
        });
        intr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),InterviewQuestion.class);
                startActivity(intent);

            }
        });

        return view;
    }

}
