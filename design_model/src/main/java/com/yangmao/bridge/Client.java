package com.yangmao.bridge;

/**
 * @author yang
 */
public class Client {

    public static void main(String[] args) {
        Brand brand = new Lenovo();
        Category category = new Desktop(brand);
        category.category();
    }
}
