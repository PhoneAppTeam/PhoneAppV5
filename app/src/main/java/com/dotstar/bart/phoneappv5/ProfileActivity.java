package com.dotstar.bart.phoneappv5;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/**
 * Created by Bart on 4/1/2015.
 */
public class ProfileActivity extends MainActivity implements View.OnClickListener{

    Button custom, friends, stats, home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        home = (Button)findViewById(R.id.home_pageButton);
        home.setOnClickListener(this);

        custom = (Button)findViewById(R.id.customizeButton);
        custom.setOnClickListener(this);

        friends = (Button)findViewById(R.id.friends_listButton);
        friends.setOnClickListener(this);

        stats = (Button)findViewById(R.id.statsButton);
        stats.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home_pageButton: {
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                finish();
            }
            case R.id.customizeButton: {
                //Intent intent = new Intent(this, SettingsActivity.class);
                //this.startActivity(intent);
                finish();
            }
            case R.id.friends_listButton: {
                //Intent intent = new Intent(this, CreateActivity.class);
                //this.startActivity(intent);
                finish();
            }
            case R.id.statsButton: {
               // Intent intent = new Intent(this, JoinActivity.class);
                //this.startActivity(intent);
                finish();
            }
        }
    }
}
