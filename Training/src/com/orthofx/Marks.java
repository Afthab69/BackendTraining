package com.orthofx;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float marks;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		marks = s.nextInt();
		if(marks>=90) {
			System.out.println("Amazing");
		}
		else if(marks>=80) {
			System.out.println("Good");
		}
		else if(marks>=70) {
			System.out.println("All right");
		}
		else {
			System.out.println("Okay");
		}
		
	}

}
