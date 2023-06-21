package com.gplaunchpad;

import java.util.*;

public class MEXEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter");
        int t = scanner.nextInt(); 

        System.out.println(" enter");
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt();

            List<List<Integer>> arrays = new ArrayList<>();

            System.out.println(" enter");
            for (int j = 0; j < k; j++) {
                int n = scanner.nextInt(); 
                List<Integer> array = new ArrayList<>();

                System.out.println(" enter");
                for (int m = 0; m < n; m++) {
                    array.add(scanner.nextInt()); 
                }

                arrays.add(array);
            }

            int result = calculateMinOperations(arrays);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int calculateMinOperations(List<List<Integer>> arrays) {
        Set<Integer> mexSet = new HashSet<>();

        for (List<Integer> array : arrays) {
            for (int num : array) {
                mexSet.add(num);
            }
        }

        int minOperations = 0;
        for (List<Integer> array : arrays) {
            Set<Integer> uniqueNums = new HashSet<>(array);

            int mex = 1;
            while (uniqueNums.contains(mex) || mexSet.contains(mex)) {
                mex++;
            }

            minOperations += mex;
            mexSet.add(mex);
        }

        return minOperations;
    }
}

