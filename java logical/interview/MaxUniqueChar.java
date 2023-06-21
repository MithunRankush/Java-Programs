package com.busibud;

import java.util.HashMap;

class MaxUniqueChar {
  public static int StringChallenge(String str) {
    HashMap<Character, Integer> charMap = new HashMap<>();
    int maxUniqueChars = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (charMap.containsKey(c)) {
        int startPos = charMap.get(c);
        int uniqueChars = getUniqueCharCount(str.substring(startPos, i));
        if (uniqueChars > maxUniqueChars) {
          maxUniqueChars = uniqueChars;
        }
      } else {
        charMap.put(c, i);
      }
    }

    return maxUniqueChars;
  }

  public static int getUniqueCharCount(String str) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (!charCount.containsKey(c)) {
        charCount.put(c, 1);
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    String input1 = "ahyjakh";
    String input2 = "ghececgkaem";
    String input3 = "mmmerme";
    String input4 = "abccdefghi";

    System.out.println(StringChallenge(input1)); 
    System.out.println(StringChallenge(input2)); 
    System.out.println(StringChallenge(input3)); 
    System.out.println(StringChallenge(input4)); 

  }
}

