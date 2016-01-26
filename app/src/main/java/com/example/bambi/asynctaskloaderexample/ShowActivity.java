package com.example.bambi.asynctaskloaderexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Bambi on 2016/01/26.
 */
public class ShowActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b != null){
            Log.i("URL:", b.getString("URL"));
        }
    }
}
