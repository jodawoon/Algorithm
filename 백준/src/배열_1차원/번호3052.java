package 배열_1차원;

import java.util.*;

//자바의 자료구조 유형도 반드시 공부해놓을것
//배열다루는 예제 많이 풀어볼것 자료구조 메서드 이용안해도 풀수있음
public class 번호3052 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arry = new int[10];
		int index=0;
		boolean bool;
		for(int i=0;i<arry.length;i++) {
			int n= in.nextInt();
			arry[i] = n%42;
		}
		for(int i=0;i<arry.length;i++) {
			bool=false;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[i]==arry[j]) {
					bool=true;
					break;
				}
			}
			if(bool==false)
				index++;
		}
		System.out.println(index);
	}
}