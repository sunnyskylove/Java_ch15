package com.ohgiraffers.section01.thread;

public class Plane implements Runnable{ // Runnable 이라는 인터페이스를 상속받기! 따라서 alt+enter> implement 해서 오버라이딩 받기!!

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("비행기가 날고 있습니다~~");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}