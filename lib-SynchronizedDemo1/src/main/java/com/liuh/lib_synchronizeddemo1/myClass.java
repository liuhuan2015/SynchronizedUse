package com.liuh.lib_synchronizeddemo1;

public class myClass {

    public static void main(String[] args) {
        System.out.println("lalalalalalalalala");

        Thread01 t01 = new Thread01();

        System.out.println("synchronized use\n------------");

        Thread ta = new Thread(t01, "A");
        Thread tb = new Thread(t01, "B");

        ta.start();
        tb.start();

    }

}
