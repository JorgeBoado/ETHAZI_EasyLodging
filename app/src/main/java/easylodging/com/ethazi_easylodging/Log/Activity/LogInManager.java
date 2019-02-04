package easylodging.com.ethazi_easylodging.Log.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import easylodging.com.ethazi_easylodging.Log.Fragment.SignIn;
import easylodging.com.ethazi_easylodging.Main.NavigationDrawer;
import easylodging.com.ethazi_easylodging.R;

public class LogInManager extends AppCompatActivity {

    private static final String TAG_LOGIN="Logueado";
    private static final String TAG_SIGNIN = "Lanzando SignIn";

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_login);

        Button btn_LogIn= findViewById(R.id.login_btn);
        TextView txv_Signin= findViewById(R.id.login_signup);

        btn_LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userValidation();
            }
        });
        txv_Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSignIn();
            }
        });

    }

    private void launchSignIn() {
        Log.d(TAG_SIGNIN, "Lanzando SignIn");
        Intent intent = new Intent(LogInManager.this, SignInManager.class);
        startActivity(intent);
    }

    private void userValidation() {
        Log.d(TAG_LOGIN, "Se ha clicado");
        Intent intent = new Intent(this, NavigationDrawer.class);
        startActivity(intent);
    }
}
