package com.yangmao;


import com.yangmao.node.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yangming
 * @date 2020/7/30
 */
public class Solution599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int sum = list1.length + list2.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            Integer list1Index = map.get(list2[i]);
            if (list1Index == null) {
                continue;
            }
            if (list1Index + i < sum) {
                list.clear();
                list.add(list2[i]);
                sum = list1Index + i;
            } else if (list1Index + i == sum) {
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[]{"KFC","Burger King","Tapioca Express","Shogun"};

        Solution599 solution599 = new Solution599();
        String[] restaurant = solution599.findRestaurant(list1, list2);
        for (String s : restaurant) {
            System.out.println(s);
        }
    }


}
