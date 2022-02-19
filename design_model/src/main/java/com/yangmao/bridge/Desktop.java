package com.yangmao.bridge;

/**
 * 桌面电脑
 *
 * @author yang
 */
public class Desktop extends Category {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void category() {
        super.category();
        System.out.println("桌面电脑");
    }
}
