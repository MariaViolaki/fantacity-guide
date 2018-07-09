package com.example.android.fantacityguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    // Handles and recycles information for each small list item while scrolling
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.small_list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        ImageView smallImage = listItemView.findViewById(R.id.small_image);
        smallImage.setImageResource(currentLocation.getImageResourceId());

        TextView smallHeader = listItemView.findViewById(R.id.small_header);
        smallHeader.setText(currentLocation.getHeaderId());

        TextView smallDescription = listItemView.findViewById(R.id.small_description);
        smallDescription.setText(currentLocation.getDescriptionId());

        TextView location = listItemView.findViewById(R.id.location);
        location.setText(currentLocation.getLocationId());

        LinearLayout smallListItem = listItemView.findViewById(R.id.small_list_item);
        smallListItem.setBackgroundResource(currentLocation.getBackgroundResourceId());

        return listItemView;
    }
}