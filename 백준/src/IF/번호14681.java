package IF;
import java.util.Scanner;

public class ¹øÈ£14681 {
	private static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int Y = in.nextInt();
		in.close();
		
		if(X>0 && Y>0) {
			System.out.println(1);
		} else if(X<0 && Y>0) {
			System.out.println(2);
		} else if(X<0 && Y<0) {
			System.out.println(3);
		} else if(X>0 && Y<0) {
			System.out.println(4);
		}
	}

}
