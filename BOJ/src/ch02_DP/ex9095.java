package ch02_DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex9095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int case_num = Integer.parseInt(br.readLine());
		int num = 0;
		int dp[] = new int[12];
		
		dp[0] = dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i=0; i<case_num; i++) {
			num = Integer.parseInt(br.readLine());
			bw.write(Integer.toString(dp[num])+'\n');
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
