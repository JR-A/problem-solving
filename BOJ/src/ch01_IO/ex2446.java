package ch01_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex2446 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int row = 2*num-1;
		int half = num-1;
		int abs;
		
		for(int i=0; i<half; i++) {
			for(int j=0; j<i; j++) {
				bw.write(" ");
			}
			for(int j=0; j<row-i*2; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		for(int i=0; i<half+1; i++) {
			for(int j=0; j<half-i; j++) {
				bw.write(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
