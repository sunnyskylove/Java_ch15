package com.ohgiraffers.section01.thread;

public class Car extends Thread{

    @Override
    public void run() {

        for(int i = 0; i < 1000; i++) {
            System.out.println("차가 움직이고 있습니다!!!");
            try {

                Thread.sleep(1);    // 작업을 지연시키는 메소드! >>> try&catch(throw 있어서 예외처리해줘야함!)

            } catch (InterruptedException e) {

                throw new RuntimeException(e);
            }
        }

    }
}