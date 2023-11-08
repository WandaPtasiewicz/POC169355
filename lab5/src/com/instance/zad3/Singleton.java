package com.instance.zad3;

class Singleton {
    static int instance;

    private Singleton(){

    }

    public static int getInstance() {
        return instance;
    }
}
