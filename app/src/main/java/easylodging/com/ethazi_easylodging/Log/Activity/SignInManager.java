package easylodging.com.ethazi_easylodging.Log.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import easylodging.com.ethazi_easylodging.Main.NavigationDrawer;
import easylodging.com.ethazi_easylodging.R;

public class SignInManager extends AppCompatActivity {
    private static final String TAG_LOGIN = "Logueado";

    private Button btn_SignIn;
    private CheckBox cbx_TC;

    protected void onCreate(Bundle savedInstanceState) {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signin);
        btn_SignIn = findViewById(R.id.signin_button);
        cbx_TC = findViewById(R.id.signin_chechbox);

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userSignIn();
            }
        });
        cbx_TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new AlertDialog.Builder(v.getContext())
                        .setTitle(getString(R.string.tc_title_text))
                        .setMessage(getString(R.string.tc_message_text))
                        .setCancelable(false)
                        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                cbx_TC.setChecked(true);
                            }
                        })
                        .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                cbx_TC.setChecked(false);
                            }
                        })

                        .show();
            }
        });

    }


    private void userSignIn() {
        Log.d(TAG_LOGIN, "Se ha clicado");
        if (cbx_TC.isChecked()) {
            //TODO Registro de usuario nuevo en base de datos
            Intent intent = new Intent(this, NavigationDrawer.class);
            startActivity(intent);
            finish();
        } else {
            new AlertDialog.Builder(this)
                    .setTitle(getString(R.string.general_error))
                    .setMessage(getString(R.string.error_message_text))
                    .show();

        }
    }
}