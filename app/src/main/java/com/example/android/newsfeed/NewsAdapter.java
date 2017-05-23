package com.example.android.newsfeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.newsfeed.R.id.date;

/**
 * Created by Marcin on 2017-03-27.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private static ClickListener clickListener;

    private ArrayList<SingleNews> mArrayAdapter;

    public NewsAdapter(ArrayList<SingleNews> listNews) {
        mArrayAdapter = listNews;
    }


    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        // create ViewHolder
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public int getItemCount() {
        return mArrayAdapter.size();
    }

    // binds the data to the textview in each cell
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        // Get the {@link News} object located at this position in the list
        SingleNews currentNews = mArrayAdapter.get(position);
//        viewHolder.imageURL = currentNews.getThumbnail();
//        new DownloadAsyncTask().execute(viewHolder);

        viewHolder.titleTextView.setText(currentNews.getTitle());
        viewHolder.shortTextView.setText(currentNews.getShorttext());

        String formattedDate = (currentNews.getDateTime()).substring(0, 10);
        viewHolder.dateView.setText(formattedDate);
        viewHolder.typeTextView.setText(currentNews.getSectionName());

    }

    public void setOnItemClickListener(ClickListener clickListener) {
        NewsAdapter.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public String imageURL;
        public ImageView imageView;
        private TextView titleTextView;
        private TextView shortTextView;
        private TextView dateView;
        private TextView typeTextView;

        public ViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view
                    .findViewById(R.id.thumbnail);
            this.titleTextView = (TextView) view
                    .findViewById(R.id.headline);
            this.shortTextView = (TextView) view
                    .findViewById(R.id.shorttext);
            this.dateView = (TextView) view
                    .findViewById(date);
            this.typeTextView = (TextView) view
                    .findViewById(R.id.SectionName);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickListener.onItemClick(getAdapterPosition(), view);
        }

    }

}
