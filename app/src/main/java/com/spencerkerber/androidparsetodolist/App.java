package com.spencerkerber.androidparsetodolist;

/**
 * Created by spencerkerber on 11/5/15.
 */
import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, ApplicationID, ClientKey); // Your Application ID and Client Key are defined elsewhere
    }
}
