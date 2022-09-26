package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 번호1152 {
	public static void main(String[] args) {
		/* sol1)->
		Scanner in =new Scanner(System.in);
		String str=in.nextLine().trim();
		System.out.println(str.split(" ").length);
		in.close();
		*/
		
		Scanner sc = new Scanner(System.in);
	    String S = sc.nextLine();
	    StringTokenizer st = new StringTokenizer(S," ");
	    
	    int n = st.countTokens();
	    System.out.println(n);
	}
}
