package �ݺ���;

import java.io.*;
import java.util.*;

//hasNext() ����
public class ��ȣ10951{
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