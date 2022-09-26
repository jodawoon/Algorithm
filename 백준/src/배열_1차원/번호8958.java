package 배열_1차원;

import java.util.Scanner;

public class 번호8958 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str[] = new String[in.nextInt()];
		
		for(int i=0;i<str.length;i++) {
			str[i]=in.next();
		}
		
		in.close();
		
		int sum=0;
		for(int i=0;i<str.length;i++) {
			int cnt=0;
			
			
			for(int j=0;j<str[i].length();j++) {
				if(str[i].charAt(j)=='o'||str[i].charAt(j)=='O') {
					cnt ++;
				} else {
					cnt=0;
				}
				sum+=cnt;
			}
			
		}
		System.out.println(sum);
	}
}
