package ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2522 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=2*n-1; i++) {
			if(i<=n) {
				for(int j=0; j<n-i; j++) {
					sb.append(" ");
				}
				for(int j=0; j<i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
			else {
				for(int j=0; j<i-n; j++) {
					sb.append(" ");
				}
				for(int j=2*n-i; j>0; j--) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb);
		br.close();
	}

}
