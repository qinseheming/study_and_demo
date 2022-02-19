package com.yangmao;

import java.util.HashSet;
import java.util.Set;

/**
 * 1252. 奇数值单元格的数目
 * https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class Solution1252 {

    // 正常穷举遍历
    public static int oddCells1(int n, int m, int[][] indices) {
        int[][] array = new int[n][m];
        int result = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                if (j == 0) {
                    for (int x = 0; x < array[indices[i][j]].length; x++) {
                        array[indices[i][j]][x]++;
                    }
                } else {
                    for (int x = 0; x < n; x++) {
                        array[x][indices[i][j]]++;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static int oddCells2(int n, int m, int[][] indices) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        int i = 0, j = 0, x = 0, y = 0;
        for (; i < indices.length; i++) {
            if (!row.contains(indices[i][0])) {
                row.add(indices[i][0]);
            } else {
                row.remove(indices[i][0]);
            }
            if (!col.contains(indices[i][1])) {
                col.add(indices[i][1]);
            } else {
                col.remove(indices[i][1]);
            }
        }
        x = row.size();
        y = col.size();
        return x * m + y * n - 2 * x * y;
    }

    public static int oddCells3(int n, int m, int[][] indices) {
        int[] row = new int[51];
        int[] col = new int[51];
        /*

         */
        int i = 0, j = 0, x = 0, y = 0;
        for (; i < indices.length; i++) {
            row[indices[i][0]] ^= 1; //0变成1，1变成0
            col[indices[i][1]] ^= 1;
        }
        for (i = 0; i < n; i++)
            x += row[i];
        for (i = 0; i < m; i++)
            y += col[i];
        //return的这个公式可以画画图想想
        return x * m + y * n - 2 * x * y;
    }



    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] indices = new int[][]{{0, 1}, {1, 1}};
//        System.out.println(oddCells1(n, m, indices));
        System.out.println(oddCells2(n, m, indices));
//        System.out.println(oddCells3(n, m, indices));
    }
}
