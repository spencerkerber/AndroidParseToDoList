package com.spencerkerber.androidparsetodolist;

/**
 * Created by spencerkerber on 11/5/15.
 */
import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "pj3Y2K74sGcTdQpxJq3kQOoIBbQOL35sIwDhAQBq", "iyqu9g73NdJTZTI1u9CQ0KZHnxzntkcDmqKVALIT"); // Your Application ID and Client Key are defined elsewhere
    }
}
