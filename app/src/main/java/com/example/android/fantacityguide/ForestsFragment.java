package com.example.android.fantacityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ForestsFragment extends Fragment {

    public ForestsFragment() {
        // Required empty public constructor
    }

    // Displays a list of forests using a ListView and a custom ArrayAdapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Creates a list of forests
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.forest_cheshire, R.string.forest_cheshire,
                R.string.forest_cheshire_info, R.string.location_conundrums_core, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_christmas, R.string.forest_christmas,
                R.string.forest_christmas_info, R.string.location_holy_veils, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_crystal, R.string.forest_crystal,
                R.string.forest_crystal_info, R.string.location_conundrums_core, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_glacial, R.string.forest_glacial,
                R.string.forest_glacial_info, R.string.location_sullenmans_land, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_mushroom, R.string.forest_mushroom,
                R.string.forest_mushroom_info, R.string.location_soaring_heights, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_nuclear, R.string.forest_nuclear,
                R.string.forest_nuclear_info, R.string.location_infernal_pools, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_ravenous, R.string.forest_ravenous,
                R.string.forest_ravenous_info, R.string.location_primeval_woods, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_submerged, R.string.forest_submerged,
                R.string.forest_submerged_info, R.string.location_somber_sanctuary, R.drawable.forest_background));
        locations.add(new Location(R.drawable.forest_undead, R.string.forest_undead,
                R.string.forest_undead_info, R.string.location_ghastly_plains, R.drawable.forest_background));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}