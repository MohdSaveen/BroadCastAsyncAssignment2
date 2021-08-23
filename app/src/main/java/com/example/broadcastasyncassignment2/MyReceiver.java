package com.example.broadcastasyncassignment2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class MyReceiver extends BroadcastReceiver {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    public MyReceiver(TextView textView1,TextView textView2,TextView textView3,TextView textView4) {
        this.textView1=textView1;
        this.textView2=textView2;
        this.textView3=textView3;
        this.textView4=textView4;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        textView1.setText(intent.getStringExtra("FirstName"));
        textView2.setText(intent.getStringExtra("LastName"));
        textView3.setText(intent.getStringExtra("Age"));
        textView4.setText(intent.getStringExtra("Occupation"));
    }
}
