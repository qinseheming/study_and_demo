package com.study.plane_war.model;


import com.study.plane_war.GameUtil;

import java.awt.*;

/**
 * @author yangming
 * @date 2020/5/24
 */
public class Explode {

    private double x;
    private double y;
    private static Image[] images = new Image[16];

    public Explode() {
    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static {
        for (int i = 0; i < images.length; i++) {
            String path = "images/explode/e" + (i + 1) + ".gif";
            images[i] = GameUtil.getImage(path);
        }
    }

    public void drawMyself(Graphics graphics) {
        for (Image image : images) {
            graphics.drawImage(image, (int) x, (int) y, null);
        }
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

    public static Image[] getImages() {
        return images;
    }

    public static void setImages(Image[] images) {
        Explode.images = images;
    }
}
