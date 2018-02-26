package com.liuh.lib_synchronizeddemo3;

/**
 * Date: 2018/2/26 10:04
 * Description:
 * synchronized对象锁
 */

public class TestObject {

    class InnerObject {

        /**
         * 内部类方法1
         */
        private void innerMethod01() {
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

        /**
         * 内部类方法2
         */
        private void innerMethod02() {
            int j = 0;
            while (j++ < 5) {
                System.out.println(Thread.currentThread().getName() + " : " + j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 外部方法1
     *
     * @param innerObject
     */
    public void outerMethod01(InnerObject innerObject) {
        synchronized (innerObject) {
            innerObject.innerMethod01();
        }
    }

    /**
     * 外部方法2
     *
     * @param innerObject
     */
    public void outerMethod02(InnerObject innerObject) {
        innerObject.innerMethod02();
    }


}
