package ���ڿ�;

import java.util.Scanner;

public class ��ȣ10809 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word=in.nextLine();
		
		for(char i='a';i<='z';i++) {
			System.out.print(word.indexOf(i)+" ");
		}
	}
}
