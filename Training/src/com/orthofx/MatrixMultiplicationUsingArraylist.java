package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMultiplicationUsingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int r1,c1,r2,c2,x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dimension of matrix 1: ");
		r1 = s.nextInt();
		c1 = s.nextInt();
		System.out.println("Enter dimension of matrix 2: ");
		r2 = s.nextInt();
		c2 = s.nextInt();
		if(c1!=r2) {
			System.out.println("Matrices incompatable for multiplication!");
			System.exit(0);
		}
		System.out.println("Enter elements of matrix 1: ");
		for(int i=0;i<r1;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c1;++j) {
				x = s.nextInt();
				a.add(x);
			}
			matrix1.add(a);
		}
		System.out.println("Enter elements of matrix 2: ");
		for(int i=0;i<r2;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c2;++j) {
				x = s.nextInt();
				a.add(x);
			}
			matrix2.add(a);
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<r1;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c2;++j) {
				x=0;
				for(int k=0;k<r2;++k) {
					x += matrix1.get(i).get(k)*matrix2.get(k).get(j);
				}
				a.add(x);
			}
			result.add(a);
		}
		for(int i=0;i<r1;++i) {
			for(int j=0;j<c2;++j) {
				System.out.print(result.get(i).get(j)+ " ");
			}
			System.out.println();
		}
	}

}
