package com.instance.zad3;

 class TestSingleton {
    public static void main(String[] args) {
        //nie ma dostępu Singleton s1= new Singleton();
        System.out.println(Singleton.getInstance());

    }
}
