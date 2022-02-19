package com.yangmao.thread;

/**
 * 模拟取钱的多线程不安全操作
 */
public class UnsafeTest02 {
    public static void main(String[] args) {
        Account account = new Account(100, "账户");
        Drawing you = new Drawing(account, 60);
        Drawing she = new Drawing(account, 70);
        new Thread(you, "you").start();
        new Thread(she, "she").start();
    }
}

class Account {

    private int money; // 账户余额
    /**
     * 账户名称
     */
    private String name; // 账户名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Drawing implements Runnable{
    private Account account;
    private int getMoneyNumber;
    private int packetMoney;

    public Drawing(Account account, int getMoneyNumber) {
        this.account = account;
        this.getMoneyNumber = getMoneyNumber;
    }

    @Override
    public void run() {
        if (account.getMoney() - getMoneyNumber < 0) {
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.setMoney(account.getMoney() - getMoneyNumber);
        packetMoney += getMoneyNumber;
        System.out.println(Thread.currentThread().getName() + "账户余额为：" + account.getMoney());
        System.out.println(Thread.currentThread().getName() + "口袋里的钱为：" + packetMoney);
    }
}