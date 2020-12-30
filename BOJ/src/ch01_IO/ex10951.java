package ch01_IO;

import java.util.Scanner;

public class ex10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		while(sc.hasNextInt()) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1+num2);
		}
		
		sc.close();
		
		/*
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        String input;
	        while((input=br.readLine()) != null) {
	            String[] nums = input.split(" ");
	            System.out.println(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
	        }
		 */
	}

}
