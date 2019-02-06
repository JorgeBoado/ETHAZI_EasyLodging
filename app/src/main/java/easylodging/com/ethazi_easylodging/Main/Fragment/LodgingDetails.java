package easylodging.com.ethazi_easylodging.Main.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import easylodging.com.ethazi_easylodging.ArrayStorage;
import easylodging.com.ethazi_easylodging.Main.Model.Lodging;
import easylodging.com.ethazi_easylodging.R;

public class LodgingDetails extends Fragment {
    private Lodging mLodging;
    private ImageView mImageView;
    private TextView mName;
    private TextView mType;
    private TextView mCapacity;
    private TextView mCategory;
    private TextView mMunicipality;
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
        int id = (int) getArguments().getSerializable(ARG_LODGING_ID);
        mLodging = searchLoadging(id);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);

        mImageView = v.findViewById(R.id.lodging_icon_image);
        switch (mLodging.getType()) {
            case "Albergues":
                mImageView.setImageResource(R.drawable.ic_cottage);
                break;
            case "Agroturismos":
                mImageView.setImageResource(R.drawable.ic_farm);
                break;
            case "Campings":
                mImageView.setImageResource(R.drawable.ic_camping);
                break;
            case "Casas Rurales":
                mImageView.setImageResource(R.drawable.ic_hostal);
                break;
        }

        mName = v.findViewById(R.id.lodging_name_textview);
        mName.setText(mLodging.getName());

        mType = v.findViewById(R.id.lodging_type_textview);
        mType.setText(mLodging.getType());

        mCapacity = v.findViewById(R.id.lodging_capacity_textview);
        mCapacity.setText(mLodging.getCapacity());

        mCategory = v.findViewById(R.id.lodging_category_textview);
        mCategory.setText(mLodging.getCapacity());

        mMunicipality = v.findViewById(R.id.lodging_municipality_textview);

        //TODO Municipality
        //mMunicipality.setText(mLodging.getMu);

        mAddress = v.findViewById(R.id.lodging_address_textview);
        mAddress.setText(mLodging.getAddress());

        mWeb = v.findViewById(R.id.lodging_web_textview);
        mWeb.setText(mLodging.getWeb());

        mMail = v.findViewById(R.id.lodging_mail_textview);
        mMail.setText(mLodging.getTurismemail());

        mPhone = v.findViewById(R.id.lodging_phone_textview);
        mPhone.setText(mLodging.getPhone());

        mDescription = v.findViewById(R.id.lodging_description_textview);
        mDescription.setText(mLodging.getDescription());


        return v;
    }

    private Lodging searchLoadging(int id) {
        for (int i = 0; i < ArrayStorage.getInstance().getSize(); i++) {
            mLodging = ArrayStorage.getInstance().getLodgings().get(i);
            if (mLodging.getId() == id) {
                return mLodging;
            }
        }
        return null;
    }
}
