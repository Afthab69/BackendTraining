import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Integer n,b;
		System.out.println("Enter value of n:");
		n = s.nextInt();
		b=n-1;
		for(int i = 0;i<n;++i) {
			for(int j = 0;j<=b;++j) {
				System.out.print(" ");
			}
			b=b-1;
			for(int j = 0;j<2*i-1;++j) {
				System.out.print("*");
			}
			System.out.println("");				
		}
		b=0;
		for(int i = 0;i<n;++i) {
			for(int j = 0;j<b;++j) {
				System.out.print(" ");
			}
			b++;
			for(int j = 0;j<2*(n-i)-1;++j) {
				System.out.print("*");
			}
			System.out.println("");	
		}
		s.close();
	}

}
