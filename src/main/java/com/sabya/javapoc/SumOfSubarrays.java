package com.sabya.javapoc;

public class SumOfSubarrays {

    public static long sumOfAllSubarrays(int[] arr) {
        int n = arr.length;
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate the number of subarrays that include arr[i]
            long contribution = (long)(i + 1) * (n - i);
            totalSum += (long)arr[i] * contribution;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Sum of all subarrays: " + sumOfAllSubarrays(arr));  // Output: 20
    }
}
