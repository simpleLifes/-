package com.example.shilixinagmu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompat {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = new TextView();
        tv.setText = "开始";
    }

    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
