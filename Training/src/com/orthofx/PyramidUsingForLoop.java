package com.orthofx;

import java.util.Scanner;

public class PyramidUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n = s.nextInt();
		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n - i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) { 
				System.out.print("* "); 
			} 
			System.out.println(); 
		}
	}

}
