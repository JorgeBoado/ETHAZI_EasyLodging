package easylodging.com.ethazi_easylodging.Main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import easylodging.com.ethazi_easylodging.R;

public class GridView extends Fragment {
    public GridView(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid_view, container, false);




        return view;
    }
}
