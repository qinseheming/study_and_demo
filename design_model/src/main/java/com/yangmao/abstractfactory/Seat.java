package com.yangmao.abstractfactory;

public interface Seat {
    void sit();
}

class HighSeat implements Seat {

    @Override
    public void sit() {
        System.out.println("高端座椅");
    }
}

class LowSeat implements Seat {

    @Override
    public void sit() {
        System.out.println("低端座椅");
    }
}