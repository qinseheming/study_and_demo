package com.yangmao.thread.weather;

/**
 * @author yangming
 * @date 2021/7/25
 */
public class WeatherTest {

    public static void main(String[] args) {
        Weather weather = new Weather();
        new Thread(new GenerateWeather(weather)).start();
        new Thread(new ReadWeather(weather)).start();
    }

}
