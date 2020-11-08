package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int d[][] = new int[N+1][10]; // d[i][j] : i자릿수이고 끝자리가 j인 오르막 수의 개수 
		int mod = 10007;
		int sum = 0;
		
		for(int i=0; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=j; k<=9; k++) {
					d[i][j] = (d[i][j] + d[i-1][k])%mod; 
				}
			}
		}
		
		for(int i=0; i<=9; i++) {
			sum = (sum + d[N][i])%mod;
		}
		
		System.out.println(sum);
		br.close();
	}

}
