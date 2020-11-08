package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11727 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] dp = new int[n+1];
		
		dp[0] = dp[1] = 1;
		for(int i=2; i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]*2)%10007;
		}
		
		System.out.println(dp[n]);
		bf.close();
	}
}
