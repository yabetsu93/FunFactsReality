package com.jabespauya.funfactsreality;

import java.util.Random;

/**
 * Created by jabespauya on 7/13/2017 AD.
 */

public class FactBook {

    //field - properties about the objects
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    //methods - actions can take
    public String getFact(){
        String fact_1 = "";
        Random random = new Random();
        int randomNumber = random.nextInt(mFacts.length);
        fact_1 = mFacts[randomNumber];
        return fact_1;
    }
}
