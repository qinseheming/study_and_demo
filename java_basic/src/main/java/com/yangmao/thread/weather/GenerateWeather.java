package com.yangmao.thread.weather;

/**
 * @author yangming
 * @date 2021/7/25
 */
public class GenerateWeather implements Runnable {

    private Weather weather;

    public GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            weather.generate();
        }
    }
}
