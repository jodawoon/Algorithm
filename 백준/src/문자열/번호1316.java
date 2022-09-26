package 문자열;

import java.util.Scanner;

public class 번호1316 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int cnt=0;
		
		for(int i=0;i<num;i++) {
			String str=in.next().toLowerCase();
			boolean check[] = new boolean[26];
			boolean m=true;
			
			for(int j=0;j<str.length();j++) {
				int sign=str.charAt(j)-'a';
				if(check[sign]==true) {
					if(str.charAt(j)!=str.charAt(j-1)) {
						m=false;
						break;
					}
				} else {
					check[sign]=true;
				}
			}
			if(m==true) {
				cnt++;
			}
		}
		in.close();
		System.out.println(cnt);
	}
}
