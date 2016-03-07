package com.majorproject.indorinamkeens.Dashboard.TrackOrder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

public class TrackOrderActivity extends DashboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linear.removeAllViews();
        View v = getLayoutInflater().inflate(R.layout.activity_track_order, null);
        linear.addView(v);

    }
}
