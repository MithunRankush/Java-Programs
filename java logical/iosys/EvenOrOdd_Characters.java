package com.iosys;

public class EvenOrOdd_Characters {

	public static void main(String[] args) {
		String str = "Mithun";
		String evenChar ="";
		String oddChar ="";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(i%2==0) {
				evenChar+=c;
			}else {
				oddChar+=c;
			}
		}
        System.out.println("Even Characters are :"+evenChar +"\n"+ "Odd Characters are :"+oddChar);
	}

}
