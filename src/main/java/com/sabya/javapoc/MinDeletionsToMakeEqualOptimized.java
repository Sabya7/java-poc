package com.sabya.javapoc;

import java.util.HashMap;
import java.util.Map;

public class MinDeletionsToMakeEqualOptimized {

    private static Map<String, Integer> memo = new HashMap<>();

    public static int minDeletionsToMakeEqual(String a, String b) {
        return minDeletions(a, b);
    }

    private static int minDeletions(String a, String b) {
        String key = a + "," + b;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (a.equals(b)) {
            return 0;
        }
        if (b.isEmpty()) {
            return a.length();
        }
        if (a.isEmpty()) {
            return b.length();
        }

        int deleteFromA = 1 + minDeletions(a.substring(1), b);
        int deleteFromB = 1 + minDeletions(a, b.substring(1));
        int minDeletionsFromEnds = Math.min(deleteFromA, deleteFromB);

        int deleteFromAEnd = 1 + minDeletions(a.substring(0, a.length() - 1), b);
        int deleteFromBEnd = 1 + minDeletions(a, b.substring(0, b.length() - 1));
        int minDeletionsFromEndEnds = Math.min(deleteFromAEnd, deleteFromBEnd);

        int result = Math.min(minDeletionsFromEnds, minDeletionsFromEndEnds);

        // Store the result in memoization map
        memo.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        String a = "abcde";
        String b = "abfde";

        int result = minDeletionsToMakeEqual(a, b);
        System.out.println("Minimum deletions required: " + result);  // Output: 3
    }
}

