package ch01_IO;

import java.util.Scanner;

public class ex11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		String str = sc.next();
		for(int i=0; i<num; i++) {
			sum += (str.charAt(i) - '0');	//char to int
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
