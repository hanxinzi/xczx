package com.xuecheng.framework.exception;

/**
 * @author Hanxinzi
 * @date 2019/8/7
 */
public class A {





   /* public static void main(String[] args) {
        A a1=new A();
        A a2=new A();

        Object o=new Object();
        System.out.println(o.equals(o.equals(o)));
        System.out.println(a1==a2);
    }*/
   public static void main(String[] args) {
       Thread thread = new Thread() {
           public void run() {
               pong();
           }
       };

       thread.start();
       //thread.run();

       System.out.println("ping");
       new A().test();

   }
       static void pong(){
           System.out.println("pong");
       }

       void test(){
           String s=new String("abc");
           String x="abc";

           System.out.println(s.hashCode());
           System.out.println(x.hashCode());
       }


   }



