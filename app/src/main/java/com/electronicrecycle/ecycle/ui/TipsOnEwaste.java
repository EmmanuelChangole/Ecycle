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

public class TipsOnEwaste extends AppCompatActivity
{
    private String content;
    private TextView tvContent;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        final ListView lv = (ListView) findViewById(R.id.managementList);
        lv.setVisibility(View.GONE);

        tvContent=(TextView)findViewById(R.id.etvContent);
        setStringValue();
        tvContent.setText(content);
        initView();

    }

    private void setStringValue()
    {
        content="Buying things we simply do not need is probably the biggest cause of e-waste. We need to stop (really, STOP) and ask ourselves if we even need a gadget or electronic item BEFORE we buy it." +
                "We need to activate that voice in our heads that prevents us from buying electronic items we simply don’t need." +
                "Organize what you have, If you don’t organize your gadgets, wires, connectors and DVDs, you”ll never really know what you have. The last thing you want is to buy something you think you need it" +
                ", only to find a duplicate buried in your cabinet.";
    }

    private void initView()
    {

        int images[]={R.drawable.ic_tips1,R.drawable.ic_tips3,R.drawable.ic_tips4,R.drawable.ic_tips5};

        SliderView sliderView = findViewById(R.id.imageSlider);

        SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.initAddress(images);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.SWAP); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
    }
}
