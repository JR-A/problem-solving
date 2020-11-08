package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long d[][] = new long[N+1][2]; //d[i][j] : i자릿수일때 끝자리가 j인 이친수의 개수 . 끝자리는 0 또는 1
		
		d[1][1] = 1;
		for(int i=2; i<=N; i++) {
			d[i][0] = d[i-1][0] + d[i-1][1];
			d[i][1] = d[i-1][0];
		}
		
		System.out.println(d[N][0] + d[N][1]);
		br.close();
	}
}
