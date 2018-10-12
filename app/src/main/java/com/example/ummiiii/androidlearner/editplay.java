package com.example.ummiiii.androidlearner;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class editplay extends Fragment {


    public editplay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_editplay, container, false);
        final EditText edittext = (EditText) view.findViewById(R.id.editText);
        final TextView text = (TextView)view.findViewById(R.id.textViewedit);
        Button btn = (Button) view.findViewById(R.id.showbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edittext.getText().toString();

                text.setText("Your Name :"+name);

            }
        });
        return view;
    }

}
