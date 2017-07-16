package com.jabespauya.funfactsreality;

import java.util.Random;

/**
 * Created by jabespauya on 7/13/2017 AD.
 */

public class ColorWheel {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //methods - actions can take
    public String getColors(){
        String color = "";
        Random random = new Random();
        int randomNumber = random.nextInt(mColors.length);
        color = mColors[randomNumber];
        return color;
    }
}
