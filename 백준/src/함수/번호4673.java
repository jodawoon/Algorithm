package �Լ�;

import java.util.Scanner;

public class ��ȣ4673 {
	Scanner in = new Scanner(System.in);
	int num=in.nextInt();
	
	public int d() {
		if (num / 10 == 0) {
			return num + num;
		}
		else if (num / 100 == 0) {
			return num + num % 10 + num / 10;
		}
		else if (num / 1000 == 0) { 
			return num + num % 10 + num / 100 + (num / 10) % 10;
		}
		else { 
			return num + num % 10 + num / 1000 + (num / 100) % 10 + (num / 10) % 10;
		}
	}
	
	public static void main(String[] args) {
		��ȣ4673 ifind=new ��ȣ4673();
		System.out.println(ifind.d());
	}
}
