package com.gplaunchpad;

import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter input");
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int k = scanner.nextInt();
            int maxProduct = findMaxProduct(numbers, k);
            System.out.println(maxProduct);
        }

        scanner.close();
    }

    private static int findMaxProduct(int[] numbers, int k) {
        int maxProduct = 0;

        for (int i = 0; i <= numbers.length - k; i++) {
            int product = 1;
            for (int j = i; j < i + k; j++) {
                product *= numbers[j];
            }
            maxProduct = Math.max(maxProduct, product);
        }

        return maxProduct;
    }
}
