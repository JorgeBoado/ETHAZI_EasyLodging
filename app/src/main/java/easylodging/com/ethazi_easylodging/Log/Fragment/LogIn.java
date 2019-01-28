package easylodging.com.ethazi_easylodging.Log.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import easylodging.com.ethazi_easylodging.Main.NavigationDrawer;
import easylodging.com.ethazi_easylodging.R;

public class LogIn extends Fragment {

    private static final String TAG_LOGIN="Logueado";
    private static final String TAG_SIGNIN = "Lanzando SignIn";

    public LogIn() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btn_LogIn= (Button) view.findViewById(R.id.login_btn);
        TextView txv_Signin= (TextView) view.findViewById(R.id.login_signup);

        btn_LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userValidation();
            }
        });
        txv_Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG_SIGNIN, "Lanzando SignIn");
                Fragment fragment = new SignIn();
                //TODO en la transicion se queda el boton de LogIn sobrepuesto en la pantalla de SignIn
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.log_fragment, fragment);
                transaction.commit();
            }
        });

        return view;
    }

    private void userValidation() {
        Log.d(TAG_LOGIN, "Se ha clicado");
        Intent intent = new Intent(getContext(), NavigationDrawer.class);
        startActivity(intent);
    }
}
