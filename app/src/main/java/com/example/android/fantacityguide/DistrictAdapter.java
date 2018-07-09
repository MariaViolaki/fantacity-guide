package com.example.android.fantacityguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DistrictAdapter extends ArrayAdapter<Location> {


    public DistrictAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    // Handles and recycles information for each large list item while scrolling
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Location currentLocation = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.large_list_item, parent, false);
        }

        ImageView largeImage = listItemView.findViewById(R.id.large_image);
        largeImage.setImageResource(currentLocation.getImageResourceId());

        TextView largeHeader = listItemView.findViewById(R.id.large_header);
        largeHeader.setText(currentLocation.getHeaderId());
        largeHeader.setBackgroundResource(currentLocation.getBackgroundResourceId());

        TextView largeDescription = listItemView.findViewById(R.id.large_description);
        largeDescription.setText(currentLocation.getDescriptionId());

        return listItemView;
    }
}