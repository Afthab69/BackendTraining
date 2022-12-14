package com.orthofx;
import java.util.*;
public class MatrixSumUsingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int r,c,x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dimension of matrices: ");
		r = s.nextInt();
		c = s.nextInt();
		System.out.println("Enter elements of matrix 1: ");
		for(int i=0;i<r;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c;++j) {
				x = s.nextInt();
				a.add(x);
			}
			matrix1.add(a);
		}
		System.out.println("Enter elements of matrix 2: ");
		for(int i=0;i<r;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c;++j) {
				x = s.nextInt();
				a.add(x);
			}
			matrix2.add(a);
		}
		System.out.println("Resultant Matrix: ");
		for(int i=0;i<r;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<c;++j) {
				x = matrix1.get(i).get(j)+matrix2.get(i).get(j);
				a.add(x);
			}
			result.add(a);
		}
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(result.get(i).get(j)+ " ");
			}
			System.out.println();
		}
	}

}
