package com.dotstar.bart.phoneappv5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bart on 4/1/2015.
 */
public class JoinActivity extends MainActivity implements View.OnClickListener{
    Button homepage;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        homepage = (Button)findViewById(R.id.home_pageButton);
        homepage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_pageButton : {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }

    }
}