package com.yangmao.decorator;

/**
 * 装饰模式的具体装饰类2
 */
public class SwimCar extends CarWapper{

    public SwimCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("可以在水里游");
    }
}
