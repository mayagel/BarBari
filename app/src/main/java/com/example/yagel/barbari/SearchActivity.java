package com.example.yagel.barbari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView search_bar;
    ArrayAdapter<String> adapter;

    public static String bar_name;
    public static int index_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_bar=(ListView) findViewById(R.id.search_bar);

        ArrayList<String> arrayBar= new ArrayList<>();
        arrayBar.addAll(Arrays.asList(getResources().getStringArray(R.array.my_bar)));

        adapter=new ArrayAdapter<String>(
                SearchActivity.this,
                android.R.layout.simple_list_item_1,
                arrayBar
        );
        search_bar.setAdapter(adapter);
        search_bar.setOnItemClickListener(this);



    }

    //search_bar- listview
    //adapter   - ArrayAdapter<String>
    //arrayBar  - ArrayList        כל הסטרינג נמצא בפנים
    //search_bar זה כל הליסט ויוו
    //עשיתי סרצ באר כמו בעיצוב, יצרתי ארייבאר שאליו הוספתי את כל המחרוזות, יצרתי אדפטר שעשה רשימה מכל המחרוזות האלה בדף, הפכתי את הליסטויוו בדף למה שיש באדפטר

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.search_manu, menu);
        MenuItem item=menu.findItem((R.id.search_bar));
        SearchView searchView=(SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    public void onItemClick (AdapterView<?> parent, View view, int position, long id){
        TextView tv = (TextView)view;
        bar_name=tv.getText().toString();
        index_bar=position;
        Toast.makeText(this, "open "+tv.getText(), Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),TheBarActivity.class);
                        startActivity(intent);
    }



}
