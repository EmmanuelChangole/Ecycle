package com.electronicrecycle.ecycle.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.electronicrecycle.ecycle.R;
import com.electronicrecycle.ecycle.adapters.CustomListAdapter;
import com.electronicrecycle.ecycle.models.ListItems;

import java.util.ArrayList;

public class ManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.managementList);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        Toast.makeText(ManagementActivity.this, "you have clicked "+position, Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }

    private ArrayList getListData() {
        ArrayList<ListItems> results = new ArrayList<>();
        ListItems user1 = new ListItems();
        user1.setName("Tips on electronic waste management.");
        user1.setId(R.drawable.ic_tips);
        results.add(user1);

        ListItems user2 = new ListItems();
        user2.setName("Advantages of curbing electronic waste disposal and recycling electronic waste.");
        user2.setId(R.drawable.ic_important);
        results.add(user2);

        ListItems user3 = new ListItems();
        user3.setName("Products that come from electronic waste and value in the market today");
        user3.setId(R.drawable.ic_used_products);
        results.add(user3);
        return results;
    }
}
