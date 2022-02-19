package com.yangmao;


import java.util.Stack;

/**
 * @author yangming
 * @date 2019/12/3
 */
public class Solution682 {

    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "+":
                    int pre = stack.pop();
                    int prepre = stack.pop();
                    stack.push(prepre);
                    stack.push(pre);
                    stack.push(pre + prepre);
                    break;
                case "D":
                    pre = stack.peek();
                    stack.push(pre * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    int num = Integer.parseInt(op);
                    stack.push(num);
                    break;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String[] ops = new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }

}
