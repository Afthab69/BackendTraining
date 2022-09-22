package com.orthofx;

import java.util.Scanner;

public class MatrixMultipliedWithAConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,c,k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dimension of matrix: ");
		r = s.nextInt();
		c = s.nextInt();
		int matrix[][] = new int[r][c];
		int result[][] = new int[r][c];
		System.out.println("Enter elements of matrix : ");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				matrix[i][j] = s.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter number to be multiplied:");
		k = s.nextInt();
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				result[i][j] = k*matrix[i][j];
			}
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
