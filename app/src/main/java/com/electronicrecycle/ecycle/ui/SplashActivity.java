package com.electronicrecycle.ecycle.ui;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.electronicrecycle.ecycle.MainActivity;
import com.electronicrecycle.ecycle.R;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashActivity extends AwesomeSplash {
    @Override
    public void initSplash(ConfigSplash configSplash)
    {
        //splash screen background properties
        configSplash.setBackgroundColor(R.color.colorCustomPink);//any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_TOP);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_TOP);
        //logo properties
        configSplash.setLogoSplash(R.drawable.ic_recycle);
        configSplash.setAnimLogoSplashDuration(3500);
        configSplash.setAnimLogoSplashTechnique(Techniques.RubberBand);
        //Title properties
        configSplash.setTitleSplash("ECycle");
        configSplash.setTitleTextColor(R.color.colorWhite);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
        int x;


    }

    @Override
    public void animationsFinished()
    {
        //Starting main activity
        Intent intent =new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
