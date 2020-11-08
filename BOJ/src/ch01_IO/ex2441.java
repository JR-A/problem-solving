package ch01_IO;

import java.util.Scanner;

public class ex2441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j<i) {
					sb.append(" ");
				}else {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
}
