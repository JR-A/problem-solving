package ch01_IO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ex2742 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = scan.nextInt();
		for(int i=num; i>0; i--) {
			bw.write(Integer.toString(i)+'\n');
		}
		
		bw.flush();
		bw.close();
		scan.close();
	}
}