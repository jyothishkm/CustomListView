package com.example.bridgeit.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String[] titles = new String[] { "Strawberry",
            "Banana", "Orange", "Mixed" };

    public static final String[] subtitle = new String[] {
            "It is an aggregate accessory fruit",
            "It is the largest herbaceous flowering plant", "Citrus Fruit",
            "Mixed Fruits" };
    int[] image = {R.drawable.strawberry,R.drawable.banana,R.drawable.orange,R.drawable.mixed_fruits};
    ListView mListView;
    List<RowItems> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.list_view);
list = new ArrayList<RowItems>();
        for (int i = 0; i<titles.length; i++) {
            RowItems items = new RowItems(image[i],titles[i],subtitle[i]);
            list.add(items);
        }
CustomBaseAdapter adapter = new CustomBaseAdapter(this,list);
        mListView.setAdapter(adapter);

    }
}
