package easylodging.com.ethazi_easylodging.LodgingDetails;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import easylodging.com.ethazi_easylodging.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class LodgingDetailsFragment extends Fragment {

    public LodgingDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lodging_details, container, false);
    }
}
