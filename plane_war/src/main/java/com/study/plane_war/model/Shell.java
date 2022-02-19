package com.study.plane_war.model;

import com.study.plane_war.constant.Constant;

import java.awt.*;

import static com.study.plane_war.constant.Constant.FRAME_TITLE_HEIGHT;


/**
 * 炮弹类
 * @author yangming
 * @date 2020/5/24
 */
public class Shell extends GameObject {

    double degree;

    public Shell() {
        this.x = 100;
        this.y = 100;
        this.width = 10;
        this.height = 10;
        this.speed = 7;
        this.degree = Math.random() * Math.PI * 2;
    }

    @Override
    public void drawMyself(Graphics graphics) {
        Color color = graphics.getColor();
        graphics.setColor(Color.RED);
        graphics.fillOval((int) x, (int) y, width, height);
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);
        if (x < 0 || x > Constant.FRAME_WIDTH - width) {
            degree = Math.PI - degree;
        }
        if (y < FRAME_TITLE_HEIGHT || y > Constant.FRAME_HEIGHT - width) {
            degree = -degree;
        }

        graphics.setColor(color);
    }
}
