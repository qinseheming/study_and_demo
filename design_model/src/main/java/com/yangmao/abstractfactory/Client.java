package com.yangmao.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory factory = new HighCarFactory();
        Engine engine = factory.getEngine();
        Seat seat = factory.getSeat();
        Tyre tyre = factory.getTyre();
        engine.run();
        seat.sit();
        tyre.turn();
    }
}
