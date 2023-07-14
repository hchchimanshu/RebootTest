package com.example.rebootdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context, "Reboot Done", Toast.LENGTH_SHORT).show();
//            Toast.makeText(context, "Reboot Done", Toast.LENGTH_LONG).show();
            Log.e("BOOT","BOOT");
        }
        else{
            Toast.makeText(context, "Other", Toast.LENGTH_SHORT).show();
//            Toast.makeText(context, "Other else", Toast.LENGTH_LONG).show();
        }
    }
}
