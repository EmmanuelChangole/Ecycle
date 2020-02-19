package com.electronicrecycle.ecycle.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.electronicrecycle.ecycle.R;
import com.electronicrecycle.ecycle.adapters.CustomListAdapter;
import com.electronicrecycle.ecycle.models.ListItems;

import java.util.ArrayList;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        RelativeLayout layout=(RelativeLayout)findViewById(R.id.relativeLayout3);
        layout.setVisibility(View.GONE);

        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.statisticsList);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                       switch (position)
                       {
                           case 0:
                               Intent facts=new Intent(StatisticsActivity.this,TipsOnEwaste.class);
                               startActivity(facts);
                               break;
                           case 1:
                               Intent stats=new Intent(StatisticsActivity.this,StatisticsOnWaste.class);
                               startActivity(stats);
                               break;
                       }

                    }
                }
        );
    }

    private ArrayList getListData() {
        ArrayList<ListItems> results = new ArrayList<>();
        ListItems user1 = new ListItems();
        user1.setName("Facts about electronic waste.");
        user1.setId(R.drawable.ic_facts);
        results.add(user1);

        ListItems user2 = new ListItems();
        user2.setName("Statistics about electronic waste");
        user2.setId(R.drawable.ic_stat);
        results.add(user2);
        return results;
    }
}
