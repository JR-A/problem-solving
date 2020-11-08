package ch01_IO;

import java.util.Scanner;

public class ex11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = 0;
		
		while(i < str.length()) {
			if((i+10) < str.length()) {
				System.out.println(str.substring(i, i+10));
			} else {
				System.out.println(str.substring(i));
			}
			i+=10;
		}
		sc.close();
	}
}