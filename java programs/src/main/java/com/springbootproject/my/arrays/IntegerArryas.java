package com.my.arrays;

import java.util.ArrayList;
import java.util.List;

public class IntegerArryas {
	public static void main(String[] args) {
		int[] input = { 4, 7, -5, -7, -8, 3 };
		List<Integer> outputArray = rearrange(input);
		for (Integer num : outputArray) {
			System.out.print(num + " ");
		}
	}
	private static List<Integer> rearrange(int[] input) {
		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();
		List<Integer> output = new ArrayList<>();
		for (Integer num : input) {
			if (num >= 0) {
				positive.add(num);
			} else {
				negative.add(num);
			}
		}
		for (int i = 0; i < positive.size() || i < negative.size(); i++) {
			if (i < positive.size()) {
				output.add(positive.get(i));
			}
			if (i < negative.size()) {
				output.add(negative.get(i));
			}
		}
		return output;
	}

}
