package com.coba.latihanlistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    String[] listArray = {"java", "kotlin", "dart", "c++", "javascript(React Native)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_list_view, listArray);
        ListView listView = (ListView) findViewById(R.id.array_list);
        listView.setAdapter(adapter);


    }
}