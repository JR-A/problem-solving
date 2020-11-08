package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2156 {
	
	public static int max(int num1, int num2) {
		if(num1>=num2) return num1;
		return num2;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int p[] = new int[N]; //포도주의 양
		int d[] = new int[N];
		
		for(int i=0; i<N; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		
		if(N >= 1) {
			d[0] = p[0];
		}
		if(N >= 2) {
			d[1] = d[0]+p[1];
		}
		if(N >= 3) {
			d[2] = max(d[1], max(p[0]+p[2], p[1]+p[2]));
		}
		for(int i=3; i<N; i++) {
			d[i] = max(d[i-1], max(d[i-2] + p[i], d[i-3]+p[i-1]+p[i]));
		}
		System.out.println(d[N-1]);
		br.close();
	}

}
