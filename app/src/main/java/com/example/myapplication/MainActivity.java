package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
//import android.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        //Log.d("activity_main", "oncreate 호출됨");
        //
//dudhfhghgh
        ListView listView = (ListView) findViewById(R.id.listviewpromise);
        listView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Information.class);
                startActivity(intent);

            }
        });


    }

}
