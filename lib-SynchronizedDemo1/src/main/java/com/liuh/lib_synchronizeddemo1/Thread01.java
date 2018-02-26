package com.liuh.lib_synchronizeddemo1;

/**
 * Date: 2018/2/26 09:04
 * Description:
 * 当两个线程并发访问同一个对象object中的这个synchronized(this)同步代码块时,
 * 同一时刻只能有一个线程得到执行,另一个线程必须等待当前线程执行完这个代码块后才能执行该代码块.
 */

public class Thread01 extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
}
