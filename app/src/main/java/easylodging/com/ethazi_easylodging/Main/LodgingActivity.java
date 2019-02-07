package easylodging.com.ethazi_easylodging.Main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import easylodging.com.ethazi_easylodging.Main.Fragment.LodgingDetails;
import easylodging.com.ethazi_easylodging.R;

public class LodgingActivity extends AppCompatActivity {
    public static final String EXTRA_LODGING_ID="com.ethazi_easylodging.Main.lodging_id";

    public static Intent newIntent(Context context, int id) {
        Intent intent = new Intent(context, LodgingActivity.class);
        intent.putExtra(EXTRA_LODGING_ID, id);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodging_details);

        FragmentManager fm= getSupportFragmentManager();
        Fragment fragment;
        fragment = createFragment();
        fm.beginTransaction().add(R.id.lodging_activity, fragment).commit();
    }

    protected Fragment createFragment(){
        int id = (int) getIntent().getIntExtra(EXTRA_LODGING_ID, 0);
        return LodgingDetails.newInstance(id);
    }
}
