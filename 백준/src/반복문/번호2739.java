package 반복문;

import java.util.Scanner;

public class 번호2739 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num>=1&&num<=9) {
			for(int i=1;i<10;i++)
				System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}