package 배열_1차원;
import java.util.Scanner;

public class 번호4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int[] arr;
        
        int num=in.nextInt();
		
		for(int i=0;i<num;i++) {
			
			int st =in.nextInt();
			arr = new int[st];
            
			double sum=0;
			
			for(int j=0; j<st; j++) {
				int val=in.nextInt();
				arr[j]=val;
				sum+=val;
			}
			
			double avg=(sum/st);
			double cnt=0;
			
			for(int j=0; j<st; j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
            
			System.out.printf("%.3f%%\n",(cnt/st)*100);
            
		}
        in.close();
	}
}
