package com.example.activity.chapter09_radiogroupdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup orientation, gravity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orientation = (RadioGroup) findViewById(R.id.orientation);
        gravity = (RadioGroup) findViewById(R.id.gravity);
        orientation.setOnCheckedChangeListener(this);
        gravity.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int id) {
        switch (id) {
            case R.id.vertical:
                orientation.setOrientation(LinearLayout.VERTICAL);
                break;
            case R.id.horizontal:
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;
            case R.id.left:
                gravity.setGravity(Gravity.LEFT);
                break;
            case R.id.center:
                gravity.setGravity(Gravity.CENTER);
                break;
            case R.id.right:
                gravity.setGravity(Gravity.RIGHT);
                break;
        }
    }
}
