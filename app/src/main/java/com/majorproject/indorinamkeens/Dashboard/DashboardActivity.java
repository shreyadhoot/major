package com.majorproject.indorinamkeens.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.majorproject.indorinamkeens.Dashboard.AboutUs.AboutUsActivity;
import com.majorproject.indorinamkeens.Dashboard.AccountDetails.AccountActivity;
import com.majorproject.indorinamkeens.Dashboard.ContactUs.ContactUsActivity;
import com.majorproject.indorinamkeens.Dashboard.Feedback.FeedbackActivity;
import com.majorproject.indorinamkeens.Dashboard.Home.CustomerHome;
import com.majorproject.indorinamkeens.Dashboard.Products.ProductsActivity;
import com.majorproject.indorinamkeens.Dashboard.RateApp.RateUs;
import com.majorproject.indorinamkeens.Dashboard.Share.ShareApp;
import com.majorproject.indorinamkeens.Dashboard.Shops.ShopsActivity;
import com.majorproject.indorinamkeens.Dashboard.TrackOrder.TrackOrderActivity;
import com.majorproject.indorinamkeens.R;

public class DashboardActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
protected LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        linear = (LinearLayout) findViewById(R.id.linear);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent in = new Intent(DashboardActivity.this, CustomerHome.class);
            startActivity(in);
            finish();

        }  else if (id == R.id.nav_products) {

            Intent in = new Intent(DashboardActivity.this, ProductsActivity.class);
            startActivity(in);


        } else if (id == R.id.nav_Shops) {

            Intent in = new Intent(DashboardActivity.this, ShopsActivity.class);
            startActivity(in);
            finish();

        } else if (id == R.id.nav_track) {

            Intent in = new Intent(DashboardActivity.this, TrackOrderActivity.class);
            startActivity(in);
            finish();

        } else if (id == R.id.nav_account) {

            Intent in = new Intent(DashboardActivity.this, AccountActivity.class);
            startActivity(in);
            finish();

        }   else if (id == R.id.nav_feedback) {

            Intent in = new Intent(DashboardActivity.this, FeedbackActivity.class);
            startActivity(in);
            finish();

        } else if (id == R.id.nav_contact) {

            Intent in = new Intent(DashboardActivity.this, ContactUsActivity.class);
            startActivity(in);
            finish();

        } else if (id == R.id.nav_about) {

            Intent in = new Intent(DashboardActivity.this, AboutUsActivity.class);
            startActivity(in);
            finish();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
