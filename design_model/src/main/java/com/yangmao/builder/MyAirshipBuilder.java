package com.yangmao.builder;

/**
 * @author yang
 */
public class MyAirshipBuilder implements AirshipBuilder {

    @Override
    public Engine buildEngine() {
        return new Engine("myEngine");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("myEscapeTower");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("myOrbitalModule");
    }
}
