package 입출력과사칙연산;

import java.util.Scanner;

public class 번호3003 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int[] chess=new int[6];		
		int[] origin= {1,1,2,2,2,8};
		
		int sum=0;
		
		for(int i=0;i<origin.length;i++) {
			chess[i]=in.nextInt();
			System.out.print(origin[i]-chess[i]+" ");
		}
	}
}
