package 문자열;

import java.util.Scanner;

public class 번호2675 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
		
		for(int i=0;i<test;i++) {
			int restart=in.nextInt();
			String p=in.next();
			
			for(int k=0;k<p.length();k++) {
				for(int j=0;j<restart;j++) {
					System.out.print(p.charAt(k));
				}
			}
			System.out.println();
		}
		in.close();
	}
}
