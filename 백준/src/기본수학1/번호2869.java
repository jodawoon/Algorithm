package 기본수학1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class 번호2869 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
 
		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
	}
}

		/* 시간초과함
		 Scanner in = new Scanner(System.in);
		int up=in.nextInt();
		int down=in.nextInt();
		int length=in.nextInt();
		
		int day=(length-down)/(up-down);
		
		if((length-down)%(up-down)!=0) {
			day++;
		} else {
			System.out.println(day);
		}
		 */	