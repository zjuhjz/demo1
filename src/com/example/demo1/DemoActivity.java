package com.example.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DemoActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private static String tag="life cycle";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(tag,"on create");
    }
    public void onStart(){
        super.onStart();
        Log.d(tag, "on start");
    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag,"on Restart");
    }

    public void onClick(){
        showDialog(1);
    }
}
