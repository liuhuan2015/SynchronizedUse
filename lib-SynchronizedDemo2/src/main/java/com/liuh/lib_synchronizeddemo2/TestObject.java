package com.liuh.lib_synchronizeddemo2;

/**
 * Date: 2018/2/26 09:30
 * Description:
 */

public class TestObject {

    public void method01() {
        synchronized (this) {
            int i = 0;
            while (i++ < 5) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void method02() {

        //第一种方式:当一个线程访问object的一个synchronized(this)同步代码块时,
        //另一个线程仍然可以访问该object中的非synchronized(this)同步代码块
        int j = 0;
        while (j++ < 5) {
            System.out.println(Thread.currentThread().getName() + " : " + j);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //第二种方式:当一个线程访问object的一个synchronized(this)同步代码块时,
        //其它线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞
//        synchronized (this) {
//            int j = 0;
//            while (j++ < 5) {
//                System.out.println(Thread.currentThread().getName() + " : " + j);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    /**
     * 当一个线程访问object的一个synchronized(this)同步代码块时,
     * 它就获得了这个object的对象锁
     * 结果:其它线程对该object对象所有的同步代码的访问都将被阻塞
     */
    public synchronized void method03() {
        int k = 0;
        while(k++<5){
            System.out.println(Thread.currentThread().getName()+" : "+k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
