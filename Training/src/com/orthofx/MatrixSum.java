package com.orthofx;
import java.util.*;
public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter dimension of matrices: ");
		r = s.nextInt();
		c = s.nextInt();
		int matrix1[][] = new int[r][c];
		int matrix2[][] = new int[r][c];
		int result[][] = new int[r][c];
		System.out.println("Enter elements of matrix 1: ");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				matrix1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter elements of matrix 2: ");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				matrix2[i][j] = s.nextInt();
			}
		}
		System.out.println("Matrix 1:");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Sum of the Matrices:");
		for(int i=0;i<r;++i) {
			for(int j=0;j<c;++j) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
