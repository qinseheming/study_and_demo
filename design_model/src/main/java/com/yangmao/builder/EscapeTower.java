package com.yangmao.builder;

/**
 * 逃逸塔
 *
 * @author 75442
 */
public class EscapeTower {

    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EscapeTower{" +
                "name='" + name + '\'' +
                '}';
    }
}
