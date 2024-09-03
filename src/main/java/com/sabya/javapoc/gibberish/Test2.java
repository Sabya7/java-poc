package com.sabya.javapoc.gibberish;

import java.util.HashMap;
import java.util.TreeSet;

class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m1 = -1, m2 = -1;
        int max1 = 0, max2 = 0;

        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            int c = map.get(x);
            if(c > max1) {
                max2 = max1;
                max1 = c;
            }
            else if( c > max2) {
                max2 = c;
            }
        }
        TreeSet<Integer> set = new TreeSet<>(map.keySet());

        for(int x : set) {
            if(map.get(x) == max2)
                return x;
        }

        return m2;
    }
}

