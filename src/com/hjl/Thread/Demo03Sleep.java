package com.hjl.Thread;
/*public static void sleep(long millis);使当前正在执行的线程以指定的毫秒数暂停(暂时停止执行).
*毫秒数结束之后，线程继续执行。
*
* */
public class Demo03Sleep {

    public static void main(String[] args) {
        for (int i=1;i<=60;i++){
            System.out.println(i+"*");
            //使用Thread类的sleep方法来让程序睡眠1秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
