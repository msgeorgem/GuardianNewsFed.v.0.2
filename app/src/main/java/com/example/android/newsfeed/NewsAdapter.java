package com.example.android.newsfeed;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static com.example.android.newsfeed.R.id.date;

/**
 * Created by Marcin on 2017-03-27.
 */

public class NewsAdapter extends ArrayAdapter<SingleNews> {
    

    public NewsAdapter(Activity context, List<SingleNews> listNews) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0b0, listNews);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        SingleNews currentNews = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.headline);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        titleTextView.setText(currentNews.getTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView shortTextView = (TextView) listItemView.findViewById(R.id.shorttext);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        shortTextView.setText(currentNews.getShorttext());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(date);
        // Format the date string (i.e. "2017-03-27")
        String formattedDate = (currentNews.getDateTime()).substring(0,10);
        // Display the date of the current news in that TextView
        dateView.setText(formattedDate);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView typeTextView = (TextView) listItemView.findViewById(R.id.SectionName);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        typeTextView.setText(currentNews.getSectionName());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
