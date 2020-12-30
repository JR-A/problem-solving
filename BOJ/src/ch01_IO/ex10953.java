package ch01_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String input = br.readLine();
			String nums[] = input.split(",");
			System.out.println(Integer.parseInt(nums[0])+Integer.parseInt(nums[1]));
		}
		
		br.close();
	}

}
