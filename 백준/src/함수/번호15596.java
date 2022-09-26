package 함수;

import java.util.Scanner;

public class 번호15596 {
	
	public long sum(int[] a) {
        long ans = 0;
        for(int i=0;i<a.length;i++) {
            ans+=a[i];
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		번호15596 ex=new 번호15596();
		Scanner in = new Scanner(System.in);
		int cnt=in.nextInt();
		int[] number = new int[cnt];
		
		for(int i=0;i<number.length;i++) {
			number[i]=in.nextInt();
		}
		System.out.println(ex.sum(number));
	}
}
