package test;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		Integer m,n;
		System.out.println("Enter dimension of mxm matrix:");
		m = s.nextInt();
		System.out.println("Enter elements of matrix:");
		for(int i=0;i<m;++i) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j=0;j<m;++j) {
				 n=s.nextInt();
				 a.add(n);
			}
			matrix.add(a);
		}
		Integer sum= 0;
		for(int i=0;i<m;++i) {
			for(int j=0;j<m;++j) {
				if(i==j || i+j==m-1) {
					sum=sum+matrix.get(i).get(j);
				}
			}
		}
		System.out.println("Result:"+sum);
		s.close();
	}

}
