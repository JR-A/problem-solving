package ch04_Brute_force;

import java.io.*;
import java.util.*;

//¿œ∞ˆ ≥≠¿Ô¿Ã
public class ex2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int[] heights = new int[9];
		int sum = 0;
		int i=0, j=0, k=0;
		
		for(i=0; i<9; i++) {
			heights[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(heights);
		
		exit_for:
		for(i=0; i<9; i++) {			
			for(j=i+1; j<9; j++) {
				sum = 0;
				for(k=0; k<9; k++) {
					if(k!=i && k!=j) sum += heights[k];
				}
				if(sum == 100) break exit_for;
			}
		}
		
		for(k=0; k<9; k++) {
			if(k!=i && k!=j) sb.append(heights[k]+"\n");
		}
		
		System.out.print(sb);
		br.close();
	}

}
