package 함수;

import java.util.Scanner;

public class 번호1065 {
	
	public int HanSu(int num) {
		int cnt=0;
		
		if(num<100) {
			return num;
		} else {
			cnt=99;
			
			for(int i=100;i<=num;i++) {
				int h=i/100;
				int t=(i/10)%10;
				int o=i%10;
				
				if((h-t)==(t-o)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		번호1065 han=new 번호1065();
		System.out.println(han.HanSu(number));
	}
}
