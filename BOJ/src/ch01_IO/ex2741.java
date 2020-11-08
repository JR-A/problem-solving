package ch01_IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ex2741 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			bf.write(Integer.toString(i)+'\n');
		}
		
		bf.flush();
		bf.close();
		scan.close();
	}
}