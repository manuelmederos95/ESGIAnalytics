package com.esgi.test.esgi_analytics;

import android.content.Context;
import android.os.AsyncTask;

public class BackgroundUpdater extends AsyncTask {
    Context context;
    BackgroundUpdater(Context ctx) {
        context = ctx;
    }
    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }
}
