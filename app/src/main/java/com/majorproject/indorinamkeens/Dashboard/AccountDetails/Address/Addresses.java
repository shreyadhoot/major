package com.majorproject.indorinamkeens.Dashboard.AccountDetails.Address;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.majorproject.indorinamkeens.R;
import com.majorproject.indorinamkeens.utils.FragmentBase;


public class Addresses extends Fragment {

    CardView addAddress;
    FrameLayout content_frame;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_address, container, false);

        addAddress = (CardView) rootView.findViewById(R.id.addAddress);
        content_frame = (FrameLayout) rootView.findViewById(R.id.content_frame);
        addAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new AddAddress());
                ft.commit();
            }
        });

        return rootView;
    }

}

