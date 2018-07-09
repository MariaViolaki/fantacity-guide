package com.example.android.fantacityguide;

public class Location {

    private int mImageResourceId;
    private int mHeaderId;
    private int mDescriptionId;
    private int mLocationId;
    private int mBackgroundResourceId;

    // Creates an object storing information about Forests, Attractions and Facilities
    public Location(int imageResourceId, int headerId, int descriptionId, int locationId, int backgroundResourceId) {
        mImageResourceId = imageResourceId;
        mHeaderId = headerId;
        mDescriptionId = descriptionId;
        mLocationId = locationId;
        mBackgroundResourceId = backgroundResourceId;
    }

    // Creates an object storing information about Districts
    public Location(int imageResourceId, int headerId, int descriptionId, int backgroundResourceId) {
        mImageResourceId = imageResourceId;
        mHeaderId = headerId;
        mDescriptionId = descriptionId;
        mBackgroundResourceId = backgroundResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getHeaderId() {
        return mHeaderId;
    }

    public int getDescriptionId() {
        return mDescriptionId;
    }

    public int getLocationId() {
        return mLocationId;
    }

    public int getBackgroundResourceId() {
        return mBackgroundResourceId;
    }
}