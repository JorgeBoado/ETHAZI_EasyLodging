package easylodging.com.ethazi_easylodging.Main.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.UUID;

import easylodging.com.ethazi_easylodging.ArrayStorage;
import easylodging.com.ethazi_easylodging.Main.Model.Lodging;

public class LodgingDetails extends Fragment {
    private Lodging mLodging;
    private ImageView mImageView;
    private TextView mName;
    private TextView mType;
    private TextView mCapacity;
    private TextView mCategory;
    private TextView municipality;
    private TextView mAddress;
    private TextView mWeb;
    private TextView mMail;
    private TextView mPhone;
    private TextView mDescription;

    private static final String ARG_LODGING_ID = "Lodging id";

    public static LodgingDetails newInstance(int id) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_LODGING_ID, id);

        LodgingDetails fragment = new LodgingDetails();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean found = false;

        int id = (int) getArguments().getSerializable(ARG_LODGING_ID);
        while (!found) {
            ArrayStorage.getInstance().getLodgings();
        }
    }
}
