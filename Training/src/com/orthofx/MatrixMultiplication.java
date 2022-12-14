package com.orthofx;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r1,c1,r2,c2;
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
		int matrix1[][] = new int[r1][c1];
		int matrix2[][] = new int[r2][c2];
		int result[][] = new int[r1][c2];
		System.out.println("Enter elements of matrix 1: ");
		for(int i=0;i<r1;++i) {
			for(int j=0;j<c1;++j) {
				matrix1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter elements of matrix 2: ");
		for(int i=0;i<r2;++i) {
			for(int j=0;j<c2;++j) {
				matrix2[i][j] = s.nextInt();
			}
		}
		System.out.println("Matrix 1:");
		for(int i=0;i<r1;++i) {
			for(int j=0;j<c1;++j) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for(int i=0;i<r2;++i) {
			for(int j=0;j<c2;++j) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<r1;++i) {
			for(int j=0;j<c2;++j) {
				result[i][j]=0;
				for(int k=0;k<r2;++k) {
					result[i][j] += matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		for(int i=0;i<r1;++i) {
			for(int j=0;j<c2;++j) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
