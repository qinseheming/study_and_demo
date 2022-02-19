package com.yangmao.tree.segment.tree;

/**
 * @author yangming
 * @date 2020/7/31
 */
public class SegmentTreeTest {

    public static void main(String[] args) {
        test();

    }

    public static void test() {
        Integer[] nums = {-2, 0, 3, -5, 2, -1};
        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, Integer::sum);
        System.out.println(segmentTree);
    }

}
