package com.yangmao.thread.weather;

import java.util.Random;

/**
 * @author yangming
 * @date 2021/7/25
 */
public class Weather {

    /**
     * 温度
     */
    private int temperature;

    /**
     * 湿度
     */
    private int humidity;

    private boolean flag;

    public synchronized void generate() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random random = new Random();
        this.temperature = random.nextInt(40);
        this.humidity = random.nextInt(100);
        System.out.println("生成天气数据" + this);
        flag = true;
        notifyAll();
    }

    public synchronized void read(){
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据" + this);
        flag = false;
        notifyAll();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "[" +
                "温度=" + temperature +
                ", 湿度=" + humidity +
                ']';
    }
}
