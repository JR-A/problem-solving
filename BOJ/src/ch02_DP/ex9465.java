package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//스티커
public class ex9465 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test_case = Integer.parseInt(br.readLine());
		int score[][]; //스티커의 점수
		int d[][];	   //해당 위치까지의 스티커 점수 합의 최대값
		int N;
		int t = 0;
		
		while(t<test_case) {
			N = Integer.parseInt(br.readLine());
			score = new int[2][N];
			d = new int[2][N];
			
			for(int row=0; row<2; row++) {
				st = new StringTokenizer(br.readLine());
				
				for(int col=0; col<N; col++) {
					score[row][col] = Integer.parseInt(st.nextToken());
				}
			}
			
			d[0][0] = score[0][0];
			d[1][0] = score[1][0];
			d[0][1] = score[1][0] + score[0][1];
			d[1][1] = score[0][0] + score[1][1];
			for(int n=2; n<N; n++) {
				d[0][n] = Math.max(d[1][n-1],d[1][n-2]) + score[0][n];
				d[1][n] = Math.max(d[0][n-1],d[0][n-2]) + score[1][n];
			}
			
			System.out.println(Math.max(d[0][N-1], d[1][N-1]));
			
			t++;
		}
		
		
		br.close();
	}
}
