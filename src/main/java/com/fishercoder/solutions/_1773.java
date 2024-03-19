package com.fishercoder.solutions;

import java.util.List;

public class _1773 {
    public static class Solution1 {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int match = 0;
            for (List<String> item : items) {
                if ("type".equals(ruleKey) && item.get(0).equals(ruleValue)) {
                    match++;
                } else if ("color".equals(ruleKey) && item.get(1).equals(ruleValue)) {
                    match++;
                } else if ("name".equals(ruleKey) && item.get(2).equals(ruleValue)) {
                    match++;
                }
            }
            return match;
        }
    }
}
