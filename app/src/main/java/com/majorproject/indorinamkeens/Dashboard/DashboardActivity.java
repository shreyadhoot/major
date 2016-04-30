package com.majorproject.indorinamkeens.Dashboard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.majorproject.indorinamkeens.Dashboard.AboutUs.AboutUsFragment;
import com.majorproject.indorinamkeens.Dashboard.AccountDetails.AccountFragment;
import com.majorproject.indorinamkeens.Dashboard.CartCheckout.CartFragment;
import com.majorproject.indorinamkeens.Dashboard.ContactUs.ContactUsFragment;
import com.majorproject.indorinamkeens.Dashboard.Feedback.FeedbackFragment;
import com.majorproject.indorinamkeens.Dashboard.Home.CustomerHomeFragment;
import com.majorproject.indorinamkeens.Dashboard.Products.ProductsFragment;
import com.majorproject.indorinamkeens.Dashboard.ShareApp.ShareAppFragment;
import com.majorproject.indorinamkeens.Dashboard.Shops.ShopsFragment;
import com.majorproject.indorinamkeens.Dashboard.TrackOrder.TrackOrderFragment;
import com.majorproject.indorinamkeens.R;

public class DashboardActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CustomerHomeFragment fragobj = new CustomerHomeFragment();
        fragmentTransactionReplace(fragobj);

        SharedPreferences sharedPref = getSharedPreferences("NamkeensPreferenceData", MODE_PRIVATE);
        String username = sharedPref.getString("Name", null);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
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
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupDrawerContent(final NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {

                    case R.id.nav_home:
                        fragmentTransactionReplace(CustomerHomeFragment.getInstance());
                        break;

                    case R.id.nav_products:
                        fragmentTransactionReplace(ProductsFragment.getInstance());
                        break;

                    case R.id.nav_Shops:
                        fragmentTransactionReplace(ShopsFragment.getInstance());
                        break;

                    case R.id.nav_cart:
                        fragmentTransactionReplace(CartFragment.getInstance());
                        break;

                    case R.id.nav_track:
                        fragmentTransactionReplace(TrackOrderFragment.getInstance());
                        break;

                    case R.id.nav_account:
                        fragmentTransactionReplace(AccountFragment.getInstance());
                        break;

                    case R.id.nav_feedback:
                        fragmentTransactionReplace(FeedbackFragment.getInstance());
                        break;

                    case R.id.nav_share:
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey! I am using this great app to buy namkeens. Check it out. Url");
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        break;

                    case R.id.nav_contact:
                        fragmentTransactionReplace(ContactUsFragment.getInstance());
                        break;

                    case R.id.nav_about:
                        fragmentTransactionReplace(AboutUsFragment.getInstance());
                        break;




                }

                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    private void fragmentTransactionReplace(Fragment fragmentInstance) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragmentInstance)
                .commit();
    }
}
