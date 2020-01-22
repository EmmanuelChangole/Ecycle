package com.electronicrecycle.ecycle.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.electronicrecycle.ecycle.R;
import com.electronicrecycle.ecycle.adapters.CustomListAdapter;
import com.electronicrecycle.ecycle.adapters.EcycleContent;
import com.electronicrecycle.ecycle.adapters.SliderAdapterExample;
import com.electronicrecycle.ecycle.models.ListItems;
import com.innodroid.expandablerecycler.ExpandableRecyclerAdapter;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EcycleActivity extends AppCompatActivity {
    /*EcycleContent adapter;
    @Bind(R.id.main_recycler)
    RecyclerView recycler;*/
    RelativeLayout mainLayout;
    View view;
    boolean check =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecycle);


        // initView();
        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.userlist);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                    {

                      switch (position)
                      {
                          case 0:
                              /*Intent intent=new Intent(EcycleActivity.this,TestUi.class);
                              startActivity(intent);*/

                              mainLayout=(RelativeLayout)findViewById(R.id.rootLayout);
                              view=getLayoutInflater().inflate(R.layout.content_view,mainLayout,true);
                              ((ViewGroup)mainLayout.getParent()).removeView(mainLayout);
                               mainLayout.addView(view);




                              break;
                          case 1:

                              break;
                          case 2:

                              break;
                          case 3:

                              break;



                      }

                    }
                }
        );



    }

    private void initView()
    {
        /*ButterKnife.bind(this);
        adapter = new EcycleContent(getApplicationContext());
        adapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler.setAdapter(adapter);*/

       /* SliderView sliderView = findViewById(R.id.imageSlider);

        SliderAdapterExample adapter = new SliderAdapterExample(this);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();*/
    }

    private ArrayList getListData() {
        ArrayList<ListItems> results = new ArrayList<>();
        ListItems user1 = new ListItems();
        user1.setName("What is electronic waste");
        user1.setId(R.drawable.ic_electronic_waste);
        results.add(user1);

        ListItems user2 = new ListItems();
        user2.setName("How electronic waste is accumulated.");
        user2.setId(R.drawable.ic_accumulated);
        results.add(user2);

        ListItems user3 = new ListItems();
        user3.setName("Why electronic waste");
        user3.setId(R.drawable.ic_why_us);
        results.add(user3);

        ListItems user4 = new ListItems();
        user4.setName("Registered companies dealing with electronic waste in Kenya");
        user4.setId(R.drawable.ic_reg_company);
        results.add(user4);


        return results;
    }


}
