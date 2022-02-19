package com.yangmao.abstractfactory;

public class HighCarFactory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new HighEngine();
    }

    @Override
    public Seat getSeat() {
        return new HighSeat();
    }

    @Override
    public Tyre getTyre() {
        return new HighTyre();
    }
}
