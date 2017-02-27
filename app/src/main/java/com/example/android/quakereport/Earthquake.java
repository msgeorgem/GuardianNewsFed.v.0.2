package com.example.android.quakereport;

/**
 * Created by Marcin on 2017-02-27.
 */

public class Earthquake {
     /**
     * mCity Name of the City
     */
    private String mCity;
    /**
     * mMagnitude magnitude of earthquake
     */
    private String mMagnitude;
    /**
     * mDate Date of the earthquake
     */
    private String mDate;


    /**
     * Create a new Earthquake object.
     *
     * @param magnitude is the strenght of the earthquake
     * @param city   is the name of the city where the earthquace occured
     * @param date it the date of the earthquake.
     */

    public Earthquake(String magnitude, String city, String date) {
        mCity = city;
        mMagnitude = magnitude;
        mDate = date;
    }

    /**
     * Get the name of the city where the earthquace occured.
     */
    public String getCity() {
        return mCity;
    }
    /**
     * Get the strenght of the earthquake.
     */
    public String getMagnitudes() {
        return mMagnitude;
    }

    /**
     * Get the Mdate of the earthquake.
     */
    public String getDates() {
        return mDate;
    }




}
