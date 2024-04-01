package com.ohgiraffers.section01.thread;

public class Tank extends Thread{

    @Override
    public void run() {

        for(int i = 0; i < 1000; i++) {
            System.out.println("탱크가 포탄을 쏘고 있습니다!!!");

            try {
                Thread.sleep(1);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }
        }

    }
}