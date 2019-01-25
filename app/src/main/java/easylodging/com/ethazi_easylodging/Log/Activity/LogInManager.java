package easylodging.com.ethazi_easylodging.Log.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import easylodging.com.ethazi_easylodging.Log.Fragment.LogIn;
import easylodging.com.ethazi_easylodging.R;

public class LogInManager extends AppCompatActivity {

    public static FragmentManager mFragmentManager;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_login);

        mFragmentManager = getSupportFragmentManager();


        if(findViewById(R.id.log_fragment)!=null){
            if(savedInstanceState !=null){
                return;

            }
            FragmentTransaction fragmentTransaction= mFragmentManager.beginTransaction();
            LogIn mLogIn = new LogIn();
            fragmentTransaction.add(R.id.log_fragment, mLogIn, null);
            fragmentTransaction.commit();
        }
    }
}
