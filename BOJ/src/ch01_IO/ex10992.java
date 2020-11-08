package ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10992 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int row = Integer.parseInt(br.readLine());
		int right = row;
		int left = row;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<row+i; j++) {
				if(i!=row) {
					if(j==left || j==right) {
						sb.append("*");
					}
					else {
						sb.append(" ");
					}
				}
				else {
					sb.append("*");
				}
			}
			sb.append("\n");
			left--;
			right++;
		}
		
		System.out.println(sb);
		br.close();
	}
}