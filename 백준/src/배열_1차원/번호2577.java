package �迭_1����;

import java.util.*;
//charAt �����Ұ� && ���ڿ��� �ٷ�°Ϳ� �ɼ�������
public class ��ȣ2577 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int result=(in.nextInt()*in.nextInt()*in.nextInt());
		String arry = Integer.toString(result);
		in.close();
		
		for(int i=0;i<10;i++) {
			int index=0;
			for(int j=0;j<arry.length();j++) {
				if((arry.charAt(j)-'0')==i)
					index++;
			}
			//for each�� �����Ұ�
			System.out.println(index);
		}
	}
}