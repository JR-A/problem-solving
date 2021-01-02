package ch04_Brute_force;

import java.io.*;

//분해합
public class ex2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 1, sum = 0, n = 0;

		for(i=1; i<N; i++) {
			//분해합 구하기 (분해합은 N과 N의 각 자리수의 합)
			sum = i;
			n = i;
			while(n != 0) {	
				sum += (int)n%10;
				n /= 10;
			}
			if(sum == N) {
				System.out.println(i);
				break;
			}
		}
		//분해합이 존재하지 않는 경우 0 출력
		if(i==N) System.out.println(0);	
		
		br.close();
	}

}
