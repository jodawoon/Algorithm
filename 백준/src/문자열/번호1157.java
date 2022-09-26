package 문자열;

import java.util.Scanner;

public class 번호1157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		String word=str.toUpperCase();
		int[] Count=new int[26];
		
		for(int i=0;i<Count.length;i++) {
			int cnt=0;
			
			for(int j=0;j<word.length();j++) {
				int ch=word.charAt(j);
				if(ch==(i+65)) {
					cnt++;
					Count[i]=cnt;
				}
			}
		}
		int max=-1;
		char str1 = 0;
		for(int i=0;i<Count.length;i++) {
			if(max<Count[i]) {
				max=Count[i];
				str1=(char)(i+65);
			} else if(max==Count[i]) {
				str1='?';
			}
		}
		System.out.println(str1);
	}
}
