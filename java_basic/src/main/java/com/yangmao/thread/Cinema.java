package com.yangmao.thread;

import java.util.ArrayList;
import java.util.List;

public class Cinema{
    private List<Integer> seat;
    private String name;

    public List<Integer> getSeat() {
        return seat;
    }

    public void setSeat(List<Integer> seat) {
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cinema(List<Integer> seat, String name) {
        this.seat = seat;
        this.name = name;
    }
}

class Customer implements Runnable {

    private List<Integer> buySeat;
    private Cinema cinema;

    public Customer(List<Integer> buySeat, Cinema cinema) {
        this.buySeat = buySeat;
        this.cinema = cinema;
    }

    @Override
    public void run() {
        bookSeat();
    }

    public boolean bookSeat() {
        List<Integer> copy = new ArrayList<>();
        copy.addAll(cinema.getSeat());
        copy.removeAll(buySeat);
        if (cinema.getSeat().size() - copy.size() != buySeat.size()) {
            System.out.println("预定失败");
            return false;
        }
        System.out.println("预定成功");
        cinema.setSeat(copy);
        return true;
    }
}

class HClient {
    public static void main(String[] args) {
        List<Integer> seat = new ArrayList<>();
        seat.add(1);
        seat.add(2);
        seat.add(3);
        seat.add(6);
        seat.add(7);

        List<Integer> buySeat1 = new ArrayList<>();
        List<Integer> buySeat2 = new ArrayList<>();
        buySeat1.add(1);
        buySeat1.add(2);
        buySeat2.add(3);
        buySeat2.add(4);
        buySeat2.add(5);

        Cinema cinema = new Cinema(seat, "电影院");
        Customer customer1 = new Customer(buySeat1, cinema);
        Customer customer2 = new Customer(buySeat2, cinema);
        new Thread(customer1, "顾客1").start();
        new Thread(customer2, "顾客2").start();
    }
}


