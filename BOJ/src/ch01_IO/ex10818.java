package ch01_IO;

import java.util.Scanner;

public class ex10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int min;
		int max;
		int x;
		
		x = scan.nextInt();
		min = x; max = x;
		for(int i=0; i<num-1; i++) {
			x = scan.nextInt();
			
			if(x < min) {
				min = x;
			}
			if(x > max) {
				max = x;
			}
		}
		System.out.print(min + " " + max);
		
		scan.close();
	}
}
