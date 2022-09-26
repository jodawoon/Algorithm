package 배열_1차원;

import java.util.*;

public class 번호1546 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		double[] arry = new double[n1];
		double max=0;
		double sum=0;
		double average=0;
		
		for(int i=0;i<arry.length;i++) {
			double num = in.nextDouble();
			arry[i] = num;
			if(max==0) {
				max=arry[i];
			} else if(max<arry[i]) {
				max=arry[i];
			}
		}
		for(int i=0;i<arry.length;i++) {
			arry[i]=(arry[i]/max)*100;
		}
		for(int i=0;i<arry.length;i++) {
			sum+=arry[i];
		}
		average=sum/n1;
		System.out.println(average);
		in.close();
	}
}