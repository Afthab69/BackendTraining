package com.orthofx;

import java.util.*;

public class FruitColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		str = s.nextLine();
//		if(str.equalsIgnoreCase("apple")) {
//			System.out.println("Red");
//		}
//		else if(str.equalsIgnoreCase("banana")) {
//			System.out.println("Yellow");
//		}
//		else {
//			System.out.println("Green");
//		}
		switch (str.toLowerCase()) {
		case "apple":
			System.out.println("Red");
			break;
		case "banana":
			System.out.println("Yellow");
			break;
		default:
			System.out.println("Green");
		}
	}

}
