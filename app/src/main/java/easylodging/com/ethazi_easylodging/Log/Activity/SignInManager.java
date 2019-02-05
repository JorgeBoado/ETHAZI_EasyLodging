package easylodging.com.ethazi_easylodging.Log.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import easylodging.com.ethazi_easylodging.Main.NavigationDrawer;
import easylodging.com.ethazi_easylodging.R;

public class SignInManager extends AppCompatActivity {
    private static final String TAG_LOGIN = "Logueado";
    private static final String TAG_SIGNIN = "Lanzando SignIn";
    private CheckBox cbx_TC;
    private TextView mName;
    private TextView mPassword;
    private TextView mRepeatPassword;
    private TextView mEmail;
    private TextView mDni;
    private boolean nameV, passV, emailV, dniV, aceptado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_signin);
        Button btn_SignIn = findViewById(R.id.signin_button);


        cbx_TC = (CheckBox) findViewById(R.id.signin_chechbox);
        mName = (TextView) findViewById(R.id.signin_username);
        mPassword = (TextView) findViewById(R.id.signin_password);
        mEmail = (TextView) findViewById(R.id.signin_email);
        mDni = (TextView) findViewById(R.id.signin_dni);
        mRepeatPassword = (TextView) findViewById(R.id.signin_repeat_password);
        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userSignIn();
            }
        });


        cbx_TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbx_TC.isChecked()) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(SignInManager.this);
                    builder1.setMessage(R.string.dialog_logoff)
                            .setCancelable(false)
                            .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    cbx_TC.setChecked(true);
                                }
                            })
                            .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    cbx_TC.setChecked(false);
                                }
                            })
                            .show();
                }
            }
        });

    }

    private void validateUser() {
        if (!mName.getText().toString().equals("")) {
            nameV = true;
        } else {
            nameV = false;
        }
        if (!mPassword.getText().toString().equals("") && mPassword.getText().toString().equals(mRepeatPassword.getText().toString())) {
            passV = true;
        } else {
            passV = false;
        }
        if (validarEmail(mEmail.getText().toString())) {
            emailV = true;
        } else {
            emailV = false;
        }

        if (validarNIF(mDni.getText().toString())) {
            dniV = true;
        } else {
            dniV = false;
        }

        if (cbx_TC.isChecked()) {
        } else {
            AlertDialog.Builder builder1;
            builder1 = new AlertDialog.Builder(SignInManager.this);
            builder1.setMessage(R.string.not_accepted)
                    .setCancelable(false)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    })

                    .show();
        }
        if (nameV && emailV && passV && dniV) {
            userSignIn();
        } else {

            String fatalError = "";

            if (!nameV) {
                fatalError += "Rellenar nombre/Fill name\n";
            }
            if (!emailV) {
                fatalError += "Comprobar email/Check email\n";
            }
            if (!passV) {
                fatalError += "Las contraseñas no son identicas/The passwords must be the same\n";
            }
            if (!dniV) {
                fatalError += "El dni no es valido/Your DNI is not valid\n";
            }
            AlertDialog.Builder builder1;
            builder1 = new AlertDialog.Builder(SignInManager.this);
            builder1.setMessage(fatalError)
                    .setCancelable(false)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    })
                    .show();
        }
    }

    private void userSignIn() {
        Log.d(TAG_LOGIN, "Se ha clicado");
        validateUser();
        Intent intent = new Intent(this, NavigationDrawer.class);
        startActivity(intent);
    }

    public static boolean validarNIF(String nif) {

        boolean correcto = false;

        Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");

        Matcher matcher = pattern.matcher(nif);

        if (matcher.matches()) {

            String letra = matcher.group(2);

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            int index = Integer.parseInt(matcher.group(1));

            index = index % 23;

            String reference = letras.substring(index, index + 1);


            if (reference.equalsIgnoreCase(letra)) {

                correcto = true;

            } else {

                correcto = false;

            }

        } else {

            correcto = false;

        }

        return correcto;

    }

    public static boolean validarEmail(String email) {

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
