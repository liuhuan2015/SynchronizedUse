package com.liuh.synchronizeduse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 在编写android 蓝牙应用时看到别人代码里面用到了这个关键字synchronized,只知道是线程同步的意思,
 * 表示在同一时刻只能有一个线程执行被synchronized修饰的代码.不知其详细使用,所以有了这个工程.
 * <p>
 * synchronized是java语言关键字,用它来修饰一个方法或者代码块时,能够保证在同一时刻最多只有一个线程执行该段代码.
 * synchronized关键字,它包括两种用法:synchronized方法和synchronized代码块.
 * <p>
 * 1,当两个并发线程访问同一个对象object中的synchronized(this)同步代码块时,同一时刻内只能有一个线程得到执行.
 * 另外一个线程必须等待当前线程执行完这个代码块后才能执行该代码块.(对应demo1)
 * <p>
 * 2,当一个线程访问object的synchronized(this)同步代码块时,另一个线程仍然可以访问该object中的非synchronized(this)
 * 同步代码块.(对应demo2,demo3)
 * <p>
 * 3,当一个线程访问object的一个synchronized(this)同步代码块时,其它线程对object中所有其它的synchronized(this)
 * 同步代码块的访问将被阻塞.(对应demo2)
 * <p>
 * 4,当一个线程访问object的一个synchronized(this)同步代码块时,它就获得了这个object的对象锁.造成的结果是:其它线程
 * 对该object对象的所有同步代码部分的都将被暂时阻塞.(对应demo2,demo3)
 * <p>
 * 在方法上加synchronized和synchronized(this)的力度都是一样的,都获得当前对象的锁.synchronized(this)比synchronized方法
 * 更灵活是因为可以在synchronized(this)之前操作其它数据.
 * <p>
 * 代码手打,出自文章:http://blog.csdn.net/cjjky/article/details/7353390
 * <p>
 * <p>
 * 以下出自文章http://www.importnew.com/21866.html
 * A:无论synchronized关键字是加在方法还是加在对象上,如果它作用的对象是非静态的,则它取得的锁是对象;
 * 如果synchronized作用的对象是一个静态方法或者是一个类,则它取得的锁是对类,该类所有的对象同一把锁.
 * <p>
 * B:每个对象只有一个锁(lock)与之相关联,谁拿到这个锁谁就可以运行它所控制的那段代码.
 * <p>
 * C:实现同步是需要很大的系统开销作为代价的,甚至可能造成死锁,所以要尽量避免无谓的同步控制
 * <p>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
