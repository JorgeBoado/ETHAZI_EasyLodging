package easylodging.com.ethazi_easylodging.Main;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import easylodging.com.ethazi_easylodging.Log.Activity.LogInManager;
import easylodging.com.ethazi_easylodging.Main.Fragment.GridView;
import easylodging.com.ethazi_easylodging.R;

public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    public static Intent newIntent(Context context) {
        Intent intent = new Intent();

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (findViewById(R.id.grid_fragment) != null) {
            if (savedInstanceState != null) {
                return;
            }
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            GridView mGridView = new GridView();
            fragmentTransaction.add(R.id.grid_fragment, mGridView, null);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        if (id == R.id.nav_list) {
            Toast.makeText(this, getString(R.string.nav_grid_item), Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_bookings) {

        } else if (id == R.id.nav_search) {
            /*FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            Search mSearch = new Search();
            fragmentTransaction.add(R.id.search_fragment, mSearch, null);
            fragmentTransaction.commit();*/
        } else if (id == R.id.nav_map) {
            //TODO Jon, mete aqui tu intent para le mapa.
        } else if (id == R.id.nav_language) {
            changeLanguage();
        } else if (id == R.id.nav_dark_mode) {

        } else if (id == R.id.nav_info) {
            launchAbout();
        } else if (id == R.id.nav_logout) {
            Intent intent_log = new Intent(this, LogInManager.class);
            startActivity(intent_log);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void launchAbout() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(getString(R.string.dialog_about))
                .setCancelable(true)
                .setNegativeButton(android.R.string.cancel, null)
                .show();
    }

    private void changeLanguage() {
        Toast.makeText(this, getString(R.string.nav_grid_item), Toast.LENGTH_LONG).show();
    }
}
