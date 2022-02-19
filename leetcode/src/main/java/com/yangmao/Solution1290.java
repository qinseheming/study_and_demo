package com.yangmao;

/**
 * @author yangming
 * @date 2019/12/16
 */
public class Solution1290 {

    public int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num << 1;
            num += head.val;
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {

    }
}
