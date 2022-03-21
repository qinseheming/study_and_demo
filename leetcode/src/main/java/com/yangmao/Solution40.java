package com.yangmao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yangming
 * @date 2019/11/29
 */
public class Solution40 {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        compute(candidates,target,0,0, path);
        return res;
    }

    private void compute(int[] candidates, int target, int index, int sum, List<Integer> oneAnswerList) {
        if (target == sum) {
            res.add(new ArrayList<>(oneAnswerList));
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int temp = candidates[i] + sum;
            if (temp <= target) {
                oneAnswerList.add(candidates[i]);
                compute(candidates, target, i + 1, temp, oneAnswerList);
                oneAnswerList.remove(oneAnswerList.size() - 1);
            } else {
                break;
            }
        }
    }



    public static void main(String[] args) {
        int[] candidates = new int[]{2,5,2,1,2};
        int target = 5;
        Solution40 solution40 = new Solution40();
        List<List<Integer>> lists = solution40.combinationSum2(candidates, target);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }
}
