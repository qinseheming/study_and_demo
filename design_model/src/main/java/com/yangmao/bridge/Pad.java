package com.yangmao.bridge;

/**
 * @author yang
 */
public class Pad extends Category {
    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void category() {
        System.out.println("平板电脑");
    }
}
