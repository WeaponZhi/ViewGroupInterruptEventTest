package com.weaponzhi.viewgroupinterrupteventtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyLayout myLayout;
    private MyButton myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout = (MyLayout) findViewById(R.id.myLayout);
        myButton = (MyButton) findViewById(R.id.myButton);
    }
}
