package com.yangmao;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yangming
 * @date 2019/11/29
 */
public class Solution933 {

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        int[] arr = new int[]{1, 100, 3001, 3002};
        for (int i : arr) {
            System.out.println(recentCounter.ping(i));
        }
    }
}

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}