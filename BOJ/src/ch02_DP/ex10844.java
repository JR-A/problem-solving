package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int d[][] = new int[N+1][10];	//d[i][j] : i자릿수이고 끝자리가 j인 계단수의 개수
		int mod = 1000000000;	//int 범위 : -2147483648 ~ 2147483647
		int sum = 0;
		
		for(int i=1; i<=9; i++) {
			d[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0) d[i][j] = d[i-1][1];
				else if(j==9) d[i][j] = d[i-1][8];
				
				else d[i][j] = (d[i-1][j-1] + d[i-1][j+1])%mod;
			}
		}
		
		for(int i=0; i<=9; i++) {
			sum = (sum + d[N][i])%mod;	//sum += d[N][i]%mod; 하면 범위 벗어남 
		}
		
		System.out.println(sum);
		br.close();
	}

}