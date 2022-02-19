package com.study.plane_war;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GameUtil {

    private GameUtil() {}

    public static Image getImage(String path) {
        URL url = null;
        try {
//            path = Thread.currentThread().getContextClassLoader().getResource("").getPath() + path;
            url = new URL(path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image image = null;
        try {
            assert url != null;
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}
