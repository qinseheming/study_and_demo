package com.yangmao.builder;

/**
 * 轨道舱
 *
 * @author 75442
 */
public class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
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
        return "OrbitalModule{" +
                "name='" + name + '\'' +
                '}';
    }
}
