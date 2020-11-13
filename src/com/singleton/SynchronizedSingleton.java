package com.singleton;

import java.util.Objects;

public class SynchronizedSingleton {

    private static SynchronizedSingleton SYNCHRONIZED_SINGLETON;

    private SynchronizedSingleton(){

    }

    public synchronized SynchronizedSingleton getIntstance(){

        if(Objects.isNull(SYNCHRONIZED_SINGLETON)) {
            synchronized(SynchronizedSingleton.class){
                if(Objects.isNull(SYNCHRONIZED_SINGLETON)) {
                    SYNCHRONIZED_SINGLETON = new SynchronizedSingleton();
                }
            }
        }
        return SYNCHRONIZED_SINGLETON;
    }
}
