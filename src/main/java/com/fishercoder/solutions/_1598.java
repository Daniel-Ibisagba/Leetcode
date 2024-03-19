package com.fishercoder.solutions;

public class _1598 {
    public static class Solution1 {
        public int minOperations(String[] logs) {
            int steps = 0;
            for (String log : logs) {
                if ("../".equals(log)) {
                    if (steps > 0) {
                        steps--;
                    }
                } else if ("./".equals(log)) {
                    //do nothing
                } else {
                    steps++;
                }
            }
            return steps;
        }
    }
}
