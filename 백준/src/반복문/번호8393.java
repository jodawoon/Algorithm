package 반복문;

import java.util.Scanner;

public class 번호8393 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		
		for(int i=1; i<=num; i++) {
			arr[i-1] = i;
		}
		int a=0;
		for(int i=0;i<num;i++) {
			a+=arr[i];
		}
		System.out.println(a);
	}
}