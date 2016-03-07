package com.majorproject.indorinamkeens.Dashboard.Home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

public class CustomerHome extends DashboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linear.removeAllViews();
        View v = getLayoutInflater().inflate(R.layout.activity_customer_home, null);
        linear.addView(v);

    }
}
