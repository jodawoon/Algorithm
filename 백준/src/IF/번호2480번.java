package IF;

import java.util.Scanner;

public class ¹øÈ£2480¹ø {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a==b&&b==c) {
			System.out.println(10000+a*1000);
		} else if(a==b||a==c) {
			System.out.println(1000+a*100);
		} else if(b==c) {
			System.out.println(1000+b*100);
		} else {
			System.out.println(100*Math.max(a,Math.max(b,c)));
		}
	}
}