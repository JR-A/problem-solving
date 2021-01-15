package ch01_IO;

import java.util.*;

public class ex1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		
		if(num1 > num2) System.out.println(">");
		else if(num1 < num2) System.out.println("<");
		else System.out.println("==");
		
		sc.close();
	}
}
