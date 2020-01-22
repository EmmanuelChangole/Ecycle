package com.electronicrecycle.ecycle.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.electronicrecycle.ecycle.R;
import com.electronicrecycle.ecycle.models.AdapterItems;
import com.electronicrecycle.ecycle.ui.EcycleActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<AdapterItems> adapterItems;
    private CustomAdapter customAdapter;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private String TAG="DashBaard";

    private int ecycle = R.drawable.ic_ecycle;
    private int effects =R.drawable.ic_effects;
    private int manage =R.drawable.ic_manage;
    private int statistics =R.drawable.ic_statistics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDrawerLayout();
        initGridView();
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(toggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }


    private void initDrawerLayout()
    {
        drawerLayout=(DrawerLayout)findViewById(R.id.drawable2);
        toggle= new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        toggle.syncState();
        drawerLayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initGridView()
    {
        GridView gridViewItems=(GridView)findViewById(R.id.grid_view_content);

        adapterItems=new ArrayList<AdapterItems>();
        adapterItems.add(new AdapterItems(R.drawable.ic_ecycle));
        adapterItems.add(new AdapterItems(R.drawable.ic_effects));
        adapterItems.add(new AdapterItems(R.drawable.ic_manage));
        adapterItems.add(new AdapterItems(R.drawable.ic_statistics));
        customAdapter=new CustomAdapter(adapterItems);
        gridViewItems.setAdapter(customAdapter);


    }
    private class CustomAdapter extends BaseAdapter
    {
        public ArrayList<AdapterItems> adapterItems=new ArrayList<AdapterItems>();

        public CustomAdapter(ArrayList<AdapterItems> adapterItems)
        {
            this.adapterItems=adapterItems;
        }


        @Override
        public int getCount() {
            return adapterItems.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            final AdapterItems items=adapterItems.get(position);

            LayoutInflater inflater=getLayoutInflater();
            View view1=(View)inflater.inflate(R.layout.list_items,null);
            final ImageView imageView=view1.findViewById(R.id.items);
            imageView.setImageResource(items.getID());
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(items.getID()== ecycle)
                    {
                        int id=1;
                        nextActivity(id);

                    }
                    else if(items.getID()== effects)
                    {
                        int id=2;
                        nextActivity(id);

                    }
                    else if(items.getID()== manage)
                    {
                        int id=3;
                        nextActivity(id);

                    }
                    else if (items.getID()== statistics)
                    {
                        int id=4;
                        nextActivity(id);

                    }


                }
            });



            return view1;
        }
    }
    private void nextActivity(int i)
    {
        switch (i)
        {
            case 1:
                    Intent eCycle=new Intent(this, EcycleActivity.class);
                    startActivity(eCycle);
                break;
            case 2:
                Intent effects=new Intent(this, EffectsActivity.class);
                startActivity(effects);

                break;
            case 3:
                Intent manage=new Intent(this, ManagementActivity.class);
                startActivity(manage);
                break;
            case 4:
                Intent statistics=new Intent(this, StatisticsActivity.class);
                startActivity(statistics);
                break;
        }
    }


}
