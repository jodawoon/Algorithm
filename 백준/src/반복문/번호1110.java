package 반복문;

import java.util.*;

public class 번호1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n<10) {
			n*=10;
		}
		int d=0;
		d=n;
		int cnt=0;
		while(true) {
			d=(d%10)*10+((d/10+d%10)%10);
			cnt+=1;
			if(n==d)
				break;
		}
		System.out.println(cnt);
		in.close();
	}
}