package com.yangmao.InnerClass;

public class TestInnerClass {

}

class Outer {
    private int age;

    class Inner {
        public void show() {
            System.out.println(Outer.this.age);
        }
    }
}
