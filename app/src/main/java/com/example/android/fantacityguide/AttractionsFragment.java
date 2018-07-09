package com.example.android.fantacityguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }

    // Displays a list of attractions using a ListView and a custom ArrayAdapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Creates a list of attractions
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.attraction_arcane_university, R.string.attraction_arcane_university,
                R.string.attraction_arcane_university_info, R.string.location_holy_veils, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_breathing_house, R.string.attraction_breathing_house,
                R.string.attraction_breathing_house_info, R.string.location_forsaken_hollows, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_cemetery_of_spirits, R.string.attraction_cemetery_of_spirits,
                R.string.attraction_cemetery_of_spirits_info, R.string.location_ghastly_plains, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_cloning_lab, R.string.attraction_cloning_lab,
                R.string.attraction_cloning_lab_info, R.string.location_somber_sanctuary, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_human_world_portal, R.string.attraction_human_world_portal,
                R.string.attraction_human_world_portal_info, R.string.location_sullenmans_land, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_lunar_oracle, R.string.attraction_lunar_oracle,
                R.string.attraction_lunar_oracle_info, R.string.location_forsaken_hollows, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_rainbows_end, R.string.attraction_rainbows_end,
                R.string.attraction_rainbows_end_info, R.string.location_conundrums_core, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_spook_festival, R.string.attraction_spook_festival,
                R.string.attraction_spook_festival_info, R.string.location_ghastly_plains, R.drawable.attraction_background));
        locations.add(new Location(R.drawable.attraction_wandering_castle, R.string.attraction_wandering_castle,
                R.string.attraction_wandering_castle_info, R.string.location_somber_sanctuary, R.drawable.attraction_background));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}