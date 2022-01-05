package com.icmi.Shoping.Utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

import com.icmi.Shoping.Activities.Home.MainActivity;
import com.icmi.Shoping.Activities.SearchActivity.SearchActivity;

public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        final ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        final android.net.NetworkInfo wifi = connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        final android.net.NetworkInfo data = connMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if (wifi.isConnected() || data.isConnected()){
            Log.d("Broadcast", "connected: ");
            Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
        }
        else{
            context.startActivity(new Intent(context, SearchActivity.class));
            Log.d("Broadcast", "not connected: ");
            Toast.makeText(context, "not Connected", Toast.LENGTH_SHORT).show();
        }
    }
}
