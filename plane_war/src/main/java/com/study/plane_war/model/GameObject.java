package com.study.plane_war.model;

import java.awt.*;

public class GameObject {

    protected Image image;
    protected double x;
    protected double y;
    protected int width;
    protected int height;
    protected int speed;

    public GameObject() {}

    public GameObject(Image image, double x, double y, int speed) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }

    public GameObject(Image image, double x, double y, int width, int height, int speed) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void drawMyself(Graphics graphics) {
        graphics.drawImage(image, (int) x, (int) y, width, height, null);
    }

    public Rectangle getRec() {
        return new Rectangle((int) x, (int) y, width, height);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
