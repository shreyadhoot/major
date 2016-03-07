package com.majorproject.indorinamkeens.Dashboard.AboutUs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

public class AboutUsActivity extends DashboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linear.removeAllViews();
        View v = getLayoutInflater().inflate(R.layout.activity_about_us, null);
        linear.addView(v);

    }
}
