package com.majorproject.indorinamkeens.Dashboard.Shops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

public class ShopsActivity extends DashboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linear.removeAllViews();
        View v = getLayoutInflater().inflate(R.layout.activity_shops, null);
        linear.addView(v);

    }
}
