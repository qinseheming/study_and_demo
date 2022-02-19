package com.yangmao.builder;

/**
 * 自定义飞船装配器
 *
 * @author yang
 */
public class MyAirshipDirector implements AirshipDirector {

    private AirshipBuilder builder;

    public MyAirshipDirector(AirshipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Airship directorAirship() {
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        return new Airship(orbitalModule, engine, escapeTower);
    }
}
