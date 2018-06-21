package com.example.jianqiang.testactivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import jianqiang.com.activityhook1.StringConstant;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("baobao222");
        setContentView(tv);

        Log.d("baobao2", String.valueOf(StringConstant.string1));
    }
}
