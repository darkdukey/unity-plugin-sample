package com.sdkbox.myplugin;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.unity3d.player.UnityPlayer;

public class My_Plugin extends Fragment
{
    public static My_Plugin instance;
    private static final String TAG = "My_Plugin";

    public static void start() {
        instance = new My_Plugin();

        //Add fragment to the current Unity Activity
        UnityPlayer.currentActivity.getFragmentManager().beginTransaction().add(instance, "My_Plugin").commit();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        logD("onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();

        logD("onStart");
    }

    @Override
    public void onStop() {
        super.onStop();

        logD("onStop");
    }

    @Override
    public void onPause() {
        super.onPause();

        logD("onPause");
    }

    @Override
    public void onResume() {
        super.onResume();

        logD("onResume");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        logD("onDestroy");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        logD("onActivityResult");
    }

    private void logD(String message) {
        Log.d(TAG, message);
    }
}
