package com.orthofx;

import java.util.Scanner;

public class PyramidUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n,i=0,j=0,k=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n = s.nextInt();
		while(i<n) {
			j=0;
			k=0;
			while(j<n-i) {
				System.out.print(" ");
				j++;
			}
			while(k<=i) {
				System.out.print("* ");
				k++;
			}
			System.out.println(); 
			i++;
		}
	}

}
