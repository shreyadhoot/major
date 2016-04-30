package com.majorproject.indorinamkeens.PreLogin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.majorproject.indorinamkeens.R;
import com.majorproject.indorinamkeens.SignUp.AdminSignUpActivity;
import com.majorproject.indorinamkeens.SignUp.CustomerSignUpActivity;
import com.majorproject.indorinamkeens.SignUp.VendorSignUpActivity;

public class PreLoginActivity extends AppCompatActivity {

    Handler mHandler = new Handler();
    CardView Customer, Vendor, Admin;
    LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);
        Customer = (CardView) findViewById(R.id.Customer);
        Vendor = (CardView) findViewById(R.id.Vendor);
        Admin = (CardView) findViewById(R.id.Admin);

        linear = (LinearLayout) findViewById(R.id.linear);
        mHandler.postDelayed(new Runnable() {
           @Override
           public void run() {
               Customer.setVisibility(View.VISIBLE);


               YoYo.with(Techniques.SlideInLeft)
                       .duration(1000)
                       .playOn(Customer);

           }
       }, 1000);


        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Vendor.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInRight)
                        .duration(1000)
                        .playOn(Vendor);
            }
        }, 2000);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Admin.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.SlideInLeft)
                        .duration(1000)
                        .playOn(Admin);
            }
        }, 3000);

        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutUp)
                        .duration(1500)
                        .playOn(linear);

                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent in = new Intent(PreLoginActivity.this, CustomerSignUpActivity.class);
                        startActivity(in);
                        finish();
                    }
                }, 1000);

            }
        });

        Vendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutUp)
                        .duration(1500)
                        .playOn(linear);

                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent in = new Intent(PreLoginActivity.this, VendorSignUpActivity.class);
                        startActivity(in);
                        finish();
                    }
                }, 1000);

            }
        });

        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideOutUp)
                        .duration(1500)
                        .playOn(linear);

                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent in = new Intent(PreLoginActivity.this, AdminSignUpActivity.class);
                        startActivity(in);
                        finish();
                    }
                }, 1000);

            }
        });

    }
}
