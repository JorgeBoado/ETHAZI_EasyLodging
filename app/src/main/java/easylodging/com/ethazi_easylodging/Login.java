package easylodging.com.ethazi_easylodging;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hide StatusBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Show LogIn Screen
        setContentView(R.layout.fragment_login);
        //Declaration
        final Button button_logIn= findViewById(R.id.login_btn);
        final Button button_signIn= (Button) findViewById(R.id.login_remember_me);

        //OnClick
        button_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateLog();
            }
        });
        button_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSighnIn();
            }
        });
    }

    private void launchSighnIn() {
        Intent i = new Intent(this, SignIn.class);
        startActivity(i);
    }

    private void validateLog() {
        //TODO hacer validacion del login
        if(true){
            //TODO meter un Bundle para pasar el nombre y email.
            Intent i = new Intent(this, NavigationDrawer.class);
            startActivity(i);

        }else{

        }

    }
}
