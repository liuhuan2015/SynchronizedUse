package com.liuh.lib_synchronizeddemo3;

public class myClass {

    public static void main(String[] args) {
        final TestObject testObject = new TestObject();
        final TestObject.InnerObject innerObj = testObject.new InnerObject();

        System.out.println("synchronized use \n------------------");

        Thread t03A = new Thread(new Runnable() {
            @Override
            public void run() {
                testObject.outerMethod01(innerObj);
            }
        }, "A");

        Thread t03B = new Thread(new Runnable() {
            @Override
            public void run() {
                testObject.outerMethod02(innerObj);
            }
        }, "B");

        t03A.start();
        t03B.start();
    }

}
