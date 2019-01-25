package easylodging.com.ethazi_easylodging.Log.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import easylodging.com.ethazi_easylodging.Main.NavigationDrawer;
import easylodging.com.ethazi_easylodging.R;

public class SignIn extends Fragment {

    private static final String TAG_SIGNIN="Registrado";
    private static final String TAG_CHECKED="Terminos y condiciones";

    public SignIn() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_singin, container, false);

        Button btn_SignIn = (Button) view.findViewById(R.id.signin_button);
        CheckBox chb_TaC= (CheckBox) view.findViewById(R.id.signin_chechbox);

        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG_SIGNIN, "Click");
                    userRegistration();
            }
        });

        chb_TaC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG_CHECKED, "Click");
            }
        });

        return view;
    }
    private void userRegistration() {
        Log.d(TAG_SIGNIN, "Se ha clicado");
        Intent intent = new Intent(getContext(), NavigationDrawer.class);
        startActivity(intent);
    }
}

