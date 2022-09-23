package com.orthofx;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMultipliedWithAConstantUsingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int r,c,x,k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dimension of matrices: ");
		r = s.nextInt();
		c = s.nextInt();
		System.out.println("Enter elements of matrix : ");
		for(int i=0;i<r;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c;++j) {
				x = s.nextInt();
				a.add(x);
			}
			matrix.add(a);
		}
		System.out.println("Enter constant: ");
		k = s.nextInt();
		for(int i=0;i<r;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c;++j) {
				x = k*matrix.get(i).get(j);
				a.add(x);
			}
			result.add(a);
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(result.get(i).get(j)+ " ");
			}
			System.out.println();
		}
	}

}
