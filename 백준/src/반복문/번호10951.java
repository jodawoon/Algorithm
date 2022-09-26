package 반복문;

import java.io.*;
import java.util.*;

//hasNext() 공부
public class 번호10951{
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a+b);
		}
		in.close();
	}
}