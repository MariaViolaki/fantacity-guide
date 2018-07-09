package com.example.android.fantacityguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FacilitiesFragment extends Fragment {


    public FacilitiesFragment() {
        // Required empty public constructor
    }

    // Displays a list of facilities using a ListView and a custom ArrayAdapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Creates a list of facilities
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.facility_city_library, R.string.facility_city_library,
                R.string.facility_city_library_info, R.string.location_sullenmans_land, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_city_tavern, R.string.facility_city_tavern,
                R.string.facility_city_tavern_info, R.string.location_soaring_heights, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_costume_shop, R.string.facility_costume_shop,
                R.string.facility_costume_shop_info, R.string.location_forsaken_hollows, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_druids_pharmacy, R.string.facility_druids_pharmacy,
                R.string.facility_druids_pharmacy_info, R.string.location_conundrums_core, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_minion_store, R.string.facility_minion_store,
                R.string.facility_minion_store_info, R.string.location_ghastly_plains, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_transformation_clinic, R.string.facility_transformation_clinic,
                R.string.facility_transformation_clinic_info, R.string.location_somber_sanctuary, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_underworld_portal, R.string.facility_underworld_portal,
                R.string.facility_underworld_portal_info, R.string.location_sullenmans_land, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_voodoo_shop, R.string.facility_voodoo_shop,
                R.string.facility_voodoo_shop_info, R.string.location_forsaken_hollows, R.drawable.facility_background));
        locations.add(new Location(R.drawable.facility_wonderland_portal, R.string.facility_wonderland_portal,
                R.string.facility_wonderland_portal_info, R.string.location_primeval_woods, R.drawable.facility_background));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(locationAdapter);

        return rootView;
    }
}