package easylodging.com.ethazi_easylodging.Main.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import easylodging.com.ethazi_easylodging.LodgingDetails.LodgingDetails;
import easylodging.com.ethazi_easylodging.Main.Model.Lodging;
import easylodging.com.ethazi_easylodging.R;

public class GridView extends Fragment {
    private RecyclerView mLodgingRecyclerView;
    private Context mContext = getContext();


    private class LodgingHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Lodging mLodging;
        private ImageView mImageView;
        private TextView mLodgingName;

        public LodgingHolder(LayoutInflater inflater, ViewGroup parent, int viewType) {
            super(inflater.inflate(viewType, parent, false));
            itemView.setOnClickListener(this);

            mImageView = itemView.findViewById(R.id.grid_item_image);
            mLodgingName = itemView.findViewById(R.id.grid_item_name);
        }


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(mContext, LodgingDetails.class);
            startActivity(intent);
        }

        public void bind(Lodging lodging) {
            mLodgingName.setText(lodging.getName());

            switch (lodging.getType()) {
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
        }
    }

    private class LodgingAdapter extends RecyclerView.Adapter<LodgingHolder>{
        private List<Lodging> mLodgingList;

        public LodgingAdapter(List<Lodging> lodgings) {
            mLodgingList=lodgings;
        }

        @NonNull
        @Override
        public LodgingHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            return new LodgingHolder(layoutInflater, viewGroup, i);
        }

        @Override
        public void onBindViewHolder(@NonNull LodgingHolder holder, int position) {
            holder.bind(mLodgingList.get(position));
        }

        @Override
        public int getItemCount() {
            return mLodgingList.size();
        }

        @Override
        public int getItemViewType(int position) {
            return super.getItemViewType(position);
        }
    }

}
