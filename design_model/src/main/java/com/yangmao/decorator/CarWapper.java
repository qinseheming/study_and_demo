package com.yangmao.decorator;

/**
 * 装饰模式的抽象装饰类
 */
public abstract class CarWapper implements ICar{
    private ICar car;

    public CarWapper(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        this.car.move();
    }
}
