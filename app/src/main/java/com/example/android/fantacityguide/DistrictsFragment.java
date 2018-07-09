package com.example.android.fantacityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DistrictsFragment extends Fragment {


    public DistrictsFragment() {
        // Required empty public constructor
    }

    // Displays a list of districts using a ListView and a custom ArrayAdapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Creates a list of districts
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.conundrums_core, R.string.conundrums_core,
                R.string.conundrums_core_info, R.color.transparent_khaki));
        locations.add(new Location(R.drawable.forsaken_hollows, R.string.forsaken_hollows,
                R.string.forsaken_hollows_info, R.color.transparent_orange));
        locations.add(new Location(R.drawable.ghastly_plains, R.string.ghastly_plains,
                R.string.ghastly_plains_info, R.color.transparent_white));
        locations.add(new Location(R.drawable.holy_veils, R.string.holy_veils,
                R.string.holy_veils_info, R.color.transparent_green));
        locations.add(new Location(R.drawable.infernal_pools, R.string.infernal_pools,
                R.string.infernal_pools_info, R.color.transparent_red));
        locations.add(new Location(R.drawable.primeval_woods, R.string.primeval_woods,
                R.string.primeval_woods_info, R.color.transparent_blue));
        locations.add(new Location(R.drawable.soaring_heights, R.string.soaring_heights,
                R.string.soaring_heights_info, R.color.transparent_brown));
        locations.add(new Location(R.drawable.somber_sanctuary, R.string.somber_sanctuary,
                R.string.somber_sanctuary_info, R.color.transparent_green));
        locations.add(new Location(R.drawable.sullenmans_land, R.string.sullenmans_land,
                R.string.sullenmans_land_info, R.color.transparent_red));

        DistrictAdapter districtAdapter = new DistrictAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(districtAdapter);

        return rootView;
    }
}