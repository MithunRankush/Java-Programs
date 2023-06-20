package com.tandemloop;

import java.util.HashMap;

public class ArrayChallenge {
    public static void main(String[] args) {
//        String[] strArr = {"(1,2)", "(2,4)", "(7,2)"};
        String[] strArr = {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};
        boolean isValidBinaryTree = isBinaryTree(strArr);
        System.out.println(isValidBinaryTree);
    }

    public static boolean isBinaryTree(String[] strArr) {
        HashMap<Integer, Integer> parentMap = new HashMap<>();
        for (String pair : strArr) {
            pair = pair.replaceAll("\\(|\\)", ""); 
            String[] nodes = pair.split(",");
            int child = Integer.parseInt(nodes[0]);
            int parent = Integer.parseInt(nodes[1]);
            parentMap.put(child, parent);
        }

        for (int child : parentMap.keySet()) {
            int parent = parentMap.get(child);
            if (parent != -1 && !parentMap.containsKey(parent))
                return false;
        }

        return true;
    }
}

