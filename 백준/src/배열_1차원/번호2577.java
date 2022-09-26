package 배열_1차원;

import java.util.*;
//charAt 공부할것 && 문자열을 다루는것에 능숙해질것
public class 번호2577 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int result=(in.nextInt()*in.nextInt()*in.nextInt());
		String arry = Integer.toString(result);
		in.close();
		
		for(int i=0;i<10;i++) {
			int index=0;
			for(int j=0;j<arry.length();j++) {
				if((arry.charAt(j)-'0')==i)
					index++;
			}
			//for each문 연습할것
			System.out.println(index);
		}
	}
}