package com.study.plane_war;

import com.study.plane_war.model.Explode;
import com.study.plane_war.model.GameObject;
import com.study.plane_war.model.Plane;
import com.study.plane_war.model.Shell;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import static com.study.plane_war.constant.Constant.BG_HEIGHT;
import static com.study.plane_war.constant.Constant.BG_LOCATION_X;
import static com.study.plane_war.constant.Constant.BG_LOCATION_Y;
import static com.study.plane_war.constant.Constant.BG_WIDTH;
import static com.study.plane_war.constant.Constant.FRAME_HEIGHT;
import static com.study.plane_war.constant.Constant.FRAME_LOCATION_X;
import static com.study.plane_war.constant.Constant.FRAME_LOCATION_Y;
import static com.study.plane_war.constant.Constant.FRAME_WIDTH;
import static com.study.plane_war.constant.Constant.PLANE_LOCATION_X;
import static com.study.plane_war.constant.Constant.PLANE_LOCATION_Y;
import static com.study.plane_war.constant.Constant.PLANE_SPEED;
import static com.study.plane_war.constant.Constant.SHELL_NUMBER;

public class PlaneWarFrame extends Frame {

    Image backgroundImg = GameUtil.getImage("images/bg.jpg");
    Image planeImg = GameUtil.getImage("images/plane.png");

    /**
     * 背景
     */
    GameObject background = new GameObject(backgroundImg, BG_LOCATION_X, BG_LOCATION_Y, BG_WIDTH, BG_HEIGHT, 0);
    Plane plane = new Plane(planeImg, PLANE_LOCATION_X, PLANE_LOCATION_Y, PLANE_SPEED);
    /**
     * 炮弹
     */
    Shell[] shells = new Shell[SHELL_NUMBER];
    Explode explode;
    Date startTime = new Date();
    Date endTime;
    long period;

    public void launchFrame() {
        this.setTitle("飞机大战");
        this.setVisible(true);
        this.setLocation(FRAME_LOCATION_X, FRAME_LOCATION_Y);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        for (int i = 0; i < shells.length; i++) {
            shells[i] = new Shell();
        }

        new PlaneThread().start();

        this.addKeyListener(new KeywordMonitor());
    }

    @Override
    public void paint(Graphics graphics) {
        System.out.println("重画窗口");
        background.drawMyself(graphics);
        plane.drawMyself(graphics);
        for (Shell shell : shells) {
            shell.drawMyself(graphics);
            boolean isCollision = shell.getRec().intersects(plane.getRec());
            if (isCollision) {
                plane.setLive(false);
                if (explode == null) {
                    explode = new Explode(plane.getX(), plane.getY());
                    endTime = new Date();
                    explode.drawMyself(graphics);
                }
            }
        }
        this.drawTime(graphics);
    }

    private void drawTime(Graphics graphics) {
        Color color = graphics.getColor();
        Font font = graphics.getFont();

        graphics.setColor(Color.cyan);
        if (plane.isLive()) {
            period = (System.currentTimeMillis() - startTime.getTime()) / 1000;
            graphics.drawString("坚持了" + period + "秒", 20, 40);
        } else {
            period = (endTime.getTime() - startTime.getTime()) / 1000;
            graphics.setColor(Color.RED);
            graphics.setFont(new Font("微软雅黑", Font.BOLD, 30));
            graphics.drawString("一共坚持" + period + "秒", 100,200);
        }
        graphics.setColor(color);
        graphics.setFont(font);

    }

    public static void main(String[] args) {
        PlaneWarFrame planeWarFrame = new PlaneWarFrame();
        planeWarFrame.launchFrame();
    }

    private Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {
            //这是游戏窗口的宽度和高度
            offScreenImage = this.createImage(FRAME_WIDTH, FRAME_HEIGHT);
        }

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }


    class PlaneThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class KeywordMonitor extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            plane.addSpeed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusSpeed(e);
        }
    }

}
