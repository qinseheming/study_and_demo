package com.yangmao.decorator;

/**
 * 装饰模式的具体装饰类1
 */
public class FlyCar extends CarWapper{

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("可以在天上飞");
    }
}
