package com.yangmao.abstractfactory;

public interface Tyre {
    void turn();
}

class HighTyre implements Tyre {

    @Override
    public void turn() {
        System.out.println("高端轮胎");
    }
}

class LowTyre implements Tyre {

    @Override
    public void turn() {
        System.out.println("低端轮胎");
    }
}