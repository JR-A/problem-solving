package ch01_IO;

import java.util.Scanner;

public class ex11719 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
		sc.close();
	}
}