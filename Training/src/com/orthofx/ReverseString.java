package com.orthofx;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev="";
		char c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = s.nextLine();
		for(int i=str.length()-1;i>=0;--i) {
			c = str.charAt(i);
			rev = rev + c;
		}
		System.out.println("Reversed String: "+ rev);
	}

}
