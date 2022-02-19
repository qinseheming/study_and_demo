package com.yangmao.thread;

public class Game implements Runnable {

    private String winner;

    @Override
    public void run() {
        for (int steps = 1; steps <= 100; steps++) {
            if (Thread.currentThread().getName().equals("rubbit") && steps % 10 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "-->" + steps);
            if (gameOver(steps)) {
                break;
            }
        }
    }

    public boolean gameOver(int steps) {
        if (winner != null) {
            return true;
        } else {
            if (steps == 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner-->" + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Game game = new Game();
        new Thread(game, "rubbit").start();
        new Thread(game, "totise").start();
    }
}
