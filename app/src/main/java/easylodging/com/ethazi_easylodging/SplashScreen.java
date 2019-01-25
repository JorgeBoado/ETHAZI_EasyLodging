package easylodging.com.ethazi_easylodging;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import easylodging.com.ethazi_easylodging.Log.Activity.LogInManager;
import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(LogInManager.class)
                .withBackgroundColor(Color.parseColor("#282C37"))
                .withSplashTimeOut(1000)
                .withLogo(R.drawable.ic_main_logo)
                .withFooterText("Aritz, Jon, Kevin, Jorge");

        //Text Color
        config.getFooterTextView().setTextColor(Color.parseColor("#1C6434"));


        //Set to view
        View view = config.create();

        //Set view to content view
        setContentView(view);
    }
}
