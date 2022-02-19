package com.yangmao;

/**
 * @author yangming
 * @date 2019/12/17
 */
public class Solution1266 {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int currentX = points[i][0];
            int currentY = points[i][1];
            int nextX = points[i + 1][0];
            int nextY = points[i + 1][1];
            int absX = Math.abs(nextX - currentX);
            int absY = Math.abs(nextY - currentY);
            count += Math.max(absX, absY);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
