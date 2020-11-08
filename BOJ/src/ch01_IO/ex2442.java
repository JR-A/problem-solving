package ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i-1; j++) {
				sb.append(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
