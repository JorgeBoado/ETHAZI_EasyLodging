package easylodging.com.ethazi_easylodging.Log.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import easylodging.com.ethazi_easylodging.Log.Fragment.SignIn;
import easylodging.com.ethazi_easylodging.Main.NavigationDrawer;
import easylodging.com.ethazi_easylodging.R;

public class SignInManager extends AppCompatActivity {
    private static final String TAG_LOGIN="Logueado";
    private static final String TAG_SIGNIN = "Lanzando SignIn";

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_signin);
        Button btn_SignIn= findViewById(R.id.signin_button);
        CheckBox cbx_TC= findViewById(R.id.signin_chechbox);

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userSignIn();
            }
        });
        cbx_TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog().Builder(this)
                        .setMessage(getString(R.string.dialog_logoff))
                        .setCancelable(false)
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                transactBack();
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, null)
                        .show();
            }
        });

    }

    private void launchSignIn() {
        Log.d(TAG_SIGNIN, "Lanzando SignIn");
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

    private void userSignIn() {
        Log.d(TAG_LOGIN, "Se ha clicado");
        Intent intent = new Intent(this, NavigationDrawer.class);
        startActivity(intent);
    }
}
