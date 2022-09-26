package 반복문;

import java.util.*;

public class 번호10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arry = new int[n];
		int x = in.nextInt();
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			arry[i] = a;
		}
		for(int i=0;i<n;i++) {
			if(arry[i]<x)
				System.out.print(arry[i]+" ");
		}
	}
}