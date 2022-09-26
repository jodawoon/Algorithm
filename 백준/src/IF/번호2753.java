package IF;
import java.util.Scanner;

public class ¹øÈ£2753 {
	private static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year =  in.nextInt();
		in.close();
		
		if(year%4==0) {
			if(year % 400 == 0) {
				System.out.println("1");
			} else if(year % 100 == 0) { 
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		} else {
			System.out.println("0");
		}
	}

}
