package �迭_1����;

import java.util.*;

//�ڹ��� �ڷᱸ�� ������ �ݵ�� �����س�����
//�迭�ٷ�� ���� ���� Ǯ��� �ڷᱸ�� �޼��� �̿���ص� Ǯ������
public class ��ȣ3052 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arry = new int[10];
		int index=0;
		boolean bool;
		for(int i=0;i<arry.length;i++) {
			int n= in.nextInt();
			arry[i] = n%42;
		}
		for(int i=0;i<arry.length;i++) {
			bool=false;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[i]==arry[j]) {
					bool=true;
					break;
				}
			}
			if(bool==false)
				index++;
		}
		System.out.println(index);
	}
}