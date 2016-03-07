package com.majorproject.indorinamkeens.Dashboard.ContactUs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.R;

public class ContactUsActivity extends DashboardActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linear.removeAllViews();
        View v  = getLayoutInflater().inflate(R.layout.activity_contact_us, null);
        linear.addView(v);
    }
}
