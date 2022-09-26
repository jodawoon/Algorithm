package 배열_1차원;

import java.util.*;

public class 번호10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arry = new int[n];
		int max=0;
		int min=0;
		for(int i=0;i<n;i++) {
			int x = in.nextInt();
			arry[i] = x;
			if(max==0&&min==0) {
				min = max = arry[i];
			} else if(arry[i]>max) {
				max = arry[i];
			} else if(arry[i]<min) {
				min = arry[i];
			}
		}
		System.out.println(min+" "+max);
	}
}