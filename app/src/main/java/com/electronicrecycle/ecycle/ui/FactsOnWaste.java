package com.electronicrecycle.ecycle.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.electronicrecycle.ecycle.R;
import com.electronicrecycle.ecycle.adapters.SliderAdapterExample;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class FactsOnWaste extends AppCompatActivity
{
    private String content;
    private TextView tvContent;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);


        final ListView lv = (ListView) findViewById(R.id.statisticsList);
        lv.setVisibility(View.GONE);

        tvContent=(TextView)findViewById(R.id.etvContent);
        setStringValue();

        tvContent.setText(content);
        initView();

    }

    private void setStringValue()
    {
        content="Electronic waste(E-waste) refers to disposal of broken or obsolete electronic components and materials.E-waste" +
                "materials may be valuable and recyclable such as random access memory and reusable laptops.However,hazardous materials" +
                "such as the cathode ray tube monitors, requires special handling in disposal.Common discard electronic products" +
                "includes computers,television stereos copiers and fax machines";
    }

    private void initView()
    {

        int images[]={R.drawable.ic_fact,R.drawable.ic_fact,R.drawable.ic_fact};

        SliderView sliderView = findViewById(R.id.imageSlider);

        SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.initAddress(images);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }
}
