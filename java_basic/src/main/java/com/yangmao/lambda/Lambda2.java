package com.yangmao.lambda;

public class Lambda2 implements ILambda2 {
    @Override
    public void lambda() {
        System.out.println("lambda");
    }

    @Override
    public void lambda2() {
        System.out.println("lambda2");
    }
}

interface ILambda2 {
    void lambda();

    void lambda2();
}
