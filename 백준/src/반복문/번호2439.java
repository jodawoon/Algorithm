package 반복문;

import java.util.*;

public class 번호2439 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(' ');
			}
			for(int j=0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}