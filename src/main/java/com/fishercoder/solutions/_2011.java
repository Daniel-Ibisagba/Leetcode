package com.fishercoder.solutions;

public class _2011 {
    public static class Solution1 {
        public int finalValueAfterOperations(String[] operations) {
            int val = 0;
            for (String op : operations) {
                if ("++X".equals(op) || "X++".equals(op)) {
                    val++;
                } else {
                    val--;
                }
            }
            return val;
        }
    }
}
