package com.liuh.lib_synchronizeddemo2;

public class myClass {

    public static void main(String[] args) {

        final TestObject testObject = new TestObject();

        System.out.println("synchronized use \n----------------------");

        Thread t02A = new Thread(new Runnable() {
            @Override
            public void run() {
                testObject.method01();
            }
        }, "A");

        Thread t02B = new Thread(new Runnable() {
            @Override
            public void run() {
                testObject.method02();
            }
        }, "B");

        Thread t02C = new Thread(new Runnable() {
            @Override
            public void run() {
                testObject.method03();
            }
        }, "C");

        t02A.start();
        t02B.start();
        t02C.start();


    }

}
