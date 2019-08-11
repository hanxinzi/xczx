package com.xuecheng.framework.exception;

/**
 * @author Hanxinzi
 * @date 2019/8/8
 */
public class C implements Runnable{

    @Override
    public void run() {
        new Thread(new C()).start();

    }

    public static void main(String[] args) {
        new C().run();
    }

}
