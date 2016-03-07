package com.majorproject.indorinamkeens.Dashboard.AccountDetails.Address;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.majorproject.indorinamkeens.R;

public class AddAddress extends Fragment {
    public AddAddress() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    Button buttonDone;
    EditText imput_name, input_pincode, input_mobile, input_alternate, input_address;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        buttonDone = (Button) getView().findViewById(R.id.buttonDone);

        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), SavedAddressActivity.class);
                startActivity(in);
            }
        });


        return inflater.inflate(R.layout.fragment_add_address, container, false);
    }

}
