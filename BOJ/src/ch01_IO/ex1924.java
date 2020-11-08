package ch01_IO;

import java.util.Scanner;

public class ex1924 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		int totalDays = 0;
		for(int i=0; i<month-1; i++) {
			totalDays += daysOfMonths[i];
		}
		totalDays += day;
		
		switch(totalDays%7) {
		case 0: System.out.println("SUN"); break;
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		}
		
		scan.close();
	}
}
