package ch01_IO;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		while(sc.hasNextInt()) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num1==0 && num2==0) break;
			System.out.println(num1+num2);
		}
		sc.close();
	}

}
