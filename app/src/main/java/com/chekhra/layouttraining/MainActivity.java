package com.chekhra.layouttraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
/**
 * Created by Sai on 8/24/2015.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void showLinearLayout(View v) {
        startActivity(new Intent(this, LinearLayoutActivity.class));
    }

    public void showRelativeLayout(View v) {
        startActivity(new Intent(this, RelativeLayoutActivity.class));
    }

    public void showTableLayout(View v) {
        startActivity(new Intent(this, TableLayoutActivity.class));
    }

    public void showGridLayout(View v) {
        startActivity(new Intent(this, GridLayoutActivity.class));
    }

    public void showTabLayout(View v) {
        startActivity(new Intent(this, TabLayoutActivity.class));
    }

}
