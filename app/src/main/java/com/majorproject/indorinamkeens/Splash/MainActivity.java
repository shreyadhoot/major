package com.majorproject.indorinamkeens.Splash;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Handler;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.majorproject.indorinamkeens.Dashboard.DashboardActivity;
import com.majorproject.indorinamkeens.PreLogin.PreLoginActivity;
import com.majorproject.indorinamkeens.R;

public class MainActivity extends AppCompatActivity {
    private int SPLASH_TIME_OUT = 5000;
    ImageView imgLogo;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        YoYo.with(Techniques.ZoomIn)
                .duration(3000)
                .playOn(imgLogo);

        SharedPreferences sharedPref = getSharedPreferences("NamkeensPreferenceData", MODE_PRIVATE);
        name = sharedPref.getString("Name", null);
        Boolean status = sharedPref.getBoolean("IsRegistered", false);

        if (status == true) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent in = new Intent(MainActivity.this, DashboardActivity.class);
                    in.putExtra("Name", name);
                    startActivity(in);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }

        if (status == false) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent in = new Intent(MainActivity.this, PreLoginActivity.class);
                    startActivity(in);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }
    }
}
