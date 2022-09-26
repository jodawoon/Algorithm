package 문자열;

import java.util.Scanner;

public class 번호2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] num1=in.next().split("");
		String[] num2=in.next().split("");
		String[] reverse1=new String[3];
		String[] reverse2=new String[3];
		
		String sum1="";
		String sum2="";
		
		for(int i=0;i<3;i++) {
			reverse1[i]=num1[2-i];
			sum1+=reverse1[i];
			reverse2[i]=num2[2-i];
			sum2+=reverse2[i];
		}
		int reNum1=Integer.parseInt(sum1);
		int reNum2=Integer.parseInt(sum2);
		
		if(reNum1<reNum2) {
			System.out.println(reNum2);
		} else if(reNum1==reNum2) {
			System.out.println("무승부");
		} else {
			System.out.println(reNum1);
		}
	}
}
