package com.majorproject.indorinamkeens.Dashboard.AccountDetails.Address;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.hanks.htextview.HTextView;
import com.hanks.htextview.HTextViewType;
import com.majorproject.indorinamkeens.R;

public class AddAddress extends Fragment {

    private CoordinatorLayout coordinatorLayout;
    private HTextView hTextView;
    EditText input_name, input_pincode, input_mobile, input_alternate, input_address;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_add_address, container, false);
        coordinatorLayout = (CoordinatorLayout) rootView.findViewById(R.id.coordinatorLayout);
        hTextView = (HTextView)rootView.findViewById(R.id.buttonDone);
        hTextView.setAnimateType(HTextViewType.LINE);
        hTextView.animateText("DONE");

        hTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = input_name.getText().toString();
                String pincode = input_pincode.getText().toString();
                String mobile = input_mobile.getText().toString();
                String alternateMobile = input_alternate.getText().toString();
                String address = input_address.getText().toString();
                Snackbar snackbar = Snackbar.make(coordinatorLayout, "Address Saved", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        return rootView;
    }

}

