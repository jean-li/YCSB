package com.yahoo.ycsb;

import cern.jet.random.engine.RandomEngine;

import java.util.Random;

/**
 * Created by jingli on 03/11/14.
 */
public class ParetoRandomEngine extends RandomEngine {
    public int nextInt(){
        Random rand = new Random();
        int max = 1000;
        int min = 1;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    @Override
    public double nextDouble(){
        return (double)nextInt();
    }
}
