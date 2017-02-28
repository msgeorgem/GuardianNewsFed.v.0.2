package com.example.android.quakereport;

/**
 * Created by Marcin on 2017-02-27.
 */

public class Earthquake {
     /**
     * mLocation Name of the Location
     */
    private String mLocation;

    /**
     * mMagnitude magnitude of earthquake
     */
    private String mMagnitude;
    /**
     * mDate Date of the earthquake
     */
    /**
     * Returns the time of the earthquake.
     */
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


    /**
     * Create a new Earthquake object.
     *
     * @param magnitude is the strenght of the earthquake
     * @param Location   is the name of the city where the earthquace occured
     * @param timeInMilliseconds it the date of the earthquake.
     */

    public Earthquake(String magnitude, String Location, long timeInMilliseconds) {
        mLocation = Location;

        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get the name of the city where the earthquace occured.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the strenght of the earthquake.
     */
    public String getMagnitudes() {
        return mMagnitude;
    }


}
