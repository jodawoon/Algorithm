package ���ڿ�;

import java.util.Scanner;

public class ��ȣ11720 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int cnt=in.nextInt();
		int sum=0;
		String[] numArry=in.next().split("");
		
		for(int i=0;i<cnt;i++) {
			sum+=Integer.parseInt(numArry[i]);
		}
		System.out.println(sum);
	}

}
