package com.cyberwith.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] title = {"Love icon","Android icon", "Cloud icon"};
    private String[] details = {"this is love icon", "this is android icon", "this is cloud icon"};
    private int[] icon = {R.drawable.ic_favorite, R.drawable.ic_android, R.drawable.ic_cloud};

    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewID);

        customAdapter = new CustomAdapter(icon,title,details,this);
        listView.setAdapter(customAdapter);

    }
}
