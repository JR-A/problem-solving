package ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int row = Integer.parseInt(br.readLine());
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i-1; j++) {
				sb.append(" ");
			}
			for(int j=0; j<=i*2+1; j++) {
				if(j%2==0) {
					sb.append("*");
				}
				else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}

}
