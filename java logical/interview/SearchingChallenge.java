package com.busibud;

public class SearchingChallenge {

    public static void main(String[] args) {
        String[] strArr = {"10111", "10101", "11101", "11111"};
        String[] strArr1 = {"1011", "0010"};
  
        System.out.println(SearchingChallenge(strArr));
        System.out.println(SearchingChallenge(strArr1));
    }

    public static int SearchingChallenge(String[] strArr) {
        int rows = strArr.length;
        int cols = strArr[0].length();
        int[][] matrix = new int[rows][cols];
        int holes = 0;

        // Convert the string array into a 2D matrix of integers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Character.getNumericValue(strArr[i].charAt(j));
            }
        }

        // Use depth-first search to find contiguous regions of 0's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    dfs(matrix, i, j);
                    holes++;
                }
            }
        }

        return holes;
    }

    private static void dfs(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check if the current position is valid and a part of a contiguous region
        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] != 0) {
            return;
        }

        // Mark the current position as visited
        matrix[row][col] = -1;

        // Recursively search in all four directions
        dfs(matrix, row - 1, col); // Up
        dfs(matrix, row + 1, col); // Down
        dfs(matrix, row, col - 1); // Left
        dfs(matrix, row, col + 1); // Right
    }
}

