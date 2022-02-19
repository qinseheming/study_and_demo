package com.yangmao.thread.weather;

/**
 * @author yangming
 * @date 2021/7/25
 */
public class ReadWeather implements Runnable {

    private Weather weather;

    public ReadWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            weather.read();
        }
    }
}
