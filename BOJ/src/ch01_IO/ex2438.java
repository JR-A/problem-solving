package ch01_IO;

import java.util.Scanner;

public class ex2438 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}		
		scan.close();
	}
}
