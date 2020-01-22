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

public class EffectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effects);

        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.effectList);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {
                        Toast.makeText(EffectsActivity.this, "you have clicked "+position, Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }


    private ArrayList getListData() {
        ArrayList<ListItems> results = new ArrayList<>();
        ListItems user1 = new ListItems();
        user1.setName("The effects of electronic waste in the body.");
        user1.setId(R.drawable.ic_body_effects);
        results.add(user1);

        ListItems user2 = new ListItems();
        user2.setName("The effect of electronic waste to the environment.");
        user2.setId(R.drawable.ic_dry);
        results.add(user2);
        return results;
    }
}
