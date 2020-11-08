package ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				sb.append("*");
			}
			for(int j=0; j<2*(n-i); j++) {
				sb.append(" ");
			}
			for(int j=0; j<i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				sb.append("*");
			}
			for(int j=0; j<2*i; j++) {
				sb.append(" ");
			}
			for(int j=0; j<n-i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.print(sb.toString());
		br.close();
	}
}
