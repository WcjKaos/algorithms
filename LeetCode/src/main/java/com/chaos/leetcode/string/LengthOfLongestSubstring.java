package com.chaos.leetcode.string;

import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int length = s.length();
        int rk  = -1,max =0;
        for (int i = 0; i < length; i++) {
            if (i!=0){
                window.remove(s.charAt(i-1));
            }
            while (rk + 1 < length && !window.contains(s.charAt(rk+1))){
                window.add(s.charAt(rk+1));
                ++rk;
            }
            max = Math.max(max,rk-i+1);
        }
        return max;
    }

}
