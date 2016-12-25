package com.example.somesh1995.mukti2017;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Home2 extends Fragment{

  //  Button workshopbutton;
    public Home2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_home2, container, false);//16.75,38.25,26.5

       /* workshopbutton=(Button)rootView.findViewById(R.id.workshopbutton);
        workshopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),WorkshopActivity.class);
                startActivity(intent);
            }
        });*/

        return rootView;
    }




}
