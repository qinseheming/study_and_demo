package com.yangmao.offer;

/**
 * @author yangming
 * @date 2020/7/4
 */
public class Offer58 {

    public String reverseLeftWords(String s, int n) {
        String preString = s.substring(0, n);
        String postString = s.substring(n);
        return postString + preString;
    }


}
