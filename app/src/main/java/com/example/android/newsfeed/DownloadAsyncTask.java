package com.example.android.newsfeed;

/**
 * Created by Marcin on 2017-05-21.
 */

//public class DownloadAsyncTask extends AsyncTask<NewsActivity.ViewHolder, Void, NewsActivity.ViewHolder> {

//    private Bitmap bitmap;
//
//    @Override
//    protected NewsActivity.ViewHolder doInBackground(NewsAdapter.ViewHolder... params) {
//        //load image directly
//        NewsActivity.ViewHolder viewHolder = params[0];
//        try {
//            URL imageURL = new URL(viewHolder.imageURL);
//            bitmap = BitmapFactory.decodeStream(imageURL.openStream());
//        } catch (IOException e) {
//            Log.e("error", "Downloading Image Failed");
//            bitmap = null;
//        }
//        return viewHolder;
//    }
//
//    @Override
//    protected void onPostExecute(NewsAdapter.ViewHolder result) {
//        if (bitmap == null) {
//            result.imageView.setImageResource(R.mipmap.ic_launcher);
//        } else {
//            result.imageView.setImageBitmap(bitmap);
//        }
//    }


//}
