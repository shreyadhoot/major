package com.majorproject.indorinamkeens.Dashboard.AccountDetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.majorproject.indorinamkeens.Dashboard.AccountDetails.Address.SavedAddressActivity;
import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

public class AccountActivity extends DashboardActivity {
CardView myOrders, cancelledOrders, savedAddress, logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linear.removeAllViews();
        View v = getLayoutInflater().inflate(R.layout.activity_account, null);
        linear.addView(v);

        myOrders = (CardView) findViewById(R.id.myOrders);
        cancelledOrders = (CardView) findViewById(R.id.cancelledOrders);
        savedAddress = (CardView) findViewById(R.id.savedAddress);
        logout = (CardView) findViewById(R.id.logout);

        myOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AccountActivity.this, MyOrdersActivity.class);
                startActivity(in);
            }
        });

        cancelledOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AccountActivity.this, CancelledOrdersActivity.class);
                startActivity(in);
            }
        });

        savedAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AccountActivity.this, SavedAddressActivity.class);
                startActivity(in);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
