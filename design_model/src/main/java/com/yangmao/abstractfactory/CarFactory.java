package com.yangmao.abstractfactory;

public interface CarFactory {

    Engine getEngine();

    Seat getSeat();

    Tyre getTyre();
}
