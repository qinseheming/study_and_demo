package com.yangmao.lambda;

public class Lambda implements ILambda {

    @Override
    public void lambda() {
        System.out.println("lambda1");
    }
}

interface ILambda {
    void lambda();
}

class Client2 {
    public static void main(String[] args) {
        ILambda lambda = new Lambda();
        lambda.lambda();

        lambda = new ILambda() {
            @Override
            public void lambda() {
                System.out.println("lambda2");
            }
        };
        lambda.lambda();

        lambda = () -> {
            System.out.println("lambda3");
        };
        lambda.lambda();

        lambda = () -> System.out.println("lambda4");
        lambda.lambda();
    }
}

