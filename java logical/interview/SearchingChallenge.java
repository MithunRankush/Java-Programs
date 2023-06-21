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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Character.getNumericValue(strArr[i].charAt(j));
            }
        }

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

        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] != 0) {
            return;
        }

       
        matrix[row][col] = -1;

        dfs(matrix, row - 1, col); 
        dfs(matrix, row + 1, col); 
        dfs(matrix, row, col - 1); 
        dfs(matrix, row, col + 1); 
    }
}

