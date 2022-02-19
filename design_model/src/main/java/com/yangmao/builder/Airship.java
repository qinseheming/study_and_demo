package com.yangmao.builder;

/**
 * 飞船
 *
 * @author 75442
 */
public class Airship {

    /**
     * 轨道仓
     */
    private OrbitalModule orbitalModule;

    /**
     * 发动机
     */
    private Engine engine;

    /**
     * 逃逸塔
     */
    private EscapeTower escapeTower;

    public Airship(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    @Override
    public String toString() {
        return "Airship{" +
                "orbitalModule=" + orbitalModule +
                ", engine=" + engine +
                ", escapeTower=" + escapeTower +
                '}';
    }
}
