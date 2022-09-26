package IF;

import java.util.Scanner;

public class ¹øÈ£2525 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		
		int a = h*60+m+n;
		int b = a/60;
		int c = a%60;
		
		if(b>=24)
			b=b-24;
		System.out.println(b+" "+c);
	}
}