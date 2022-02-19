package com.yangmao.abstractfactory;

public interface Engine {
    void run();
}

class HighEngine implements Engine {
    @Override
    public void run() {
        System.out.println("高端引擎");
    }
}

class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("低端引擎");
    }
}
