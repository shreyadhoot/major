package com.majorproject.indorinamkeens.Dashboard.AccountDetails.Address;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.majorproject.indorinamkeens.R;



public class Addresses extends Fragment {
    public Addresses() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    CardView addAddress;
    FrameLayout content_frame;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        addAddress = (CardView) getView().findViewById(R.id.addAddress);
        content_frame = (FrameLayout) getView().findViewById(R.id.content_frame);
        addAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new AddAddress());
                ft.commit();
            }
        });

        return inflater.inflate(R.layout.fragment_address, container, false);
    }

}
