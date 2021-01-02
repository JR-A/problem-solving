package ch04_Brute_force;

import java.io.*;
import java.util.*;

//일곱 난쟁이
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
		
		//line 16~34 대체. 입력받으며 sum더하고 sum에서 i,j를 빼서 체크
		/*
		 	for(int i = 0; i < 9; i++) {
	            height[i] = Integer.parseInt(br.readLine());
	            sum += height[i];
	        }
	        Arrays.sort(height);
	        
			StringBuilder sb = new StringBuilder();
	        Loop:
	        for(int i = 0; i < 9; i++) {
	            for(int j = i+1; j < 9; j++) {
	                if(sum - height[i] - height[j] == 100) {
	                    for(int k = 0; k < 9; k++) {
	                        if(i == k || j == k) continue;
	                        sb.append(height[k]).append("\n");
	                    }
	                    break Loop;
	                }
	            }
	        }
		*/
		
		System.out.print(sb);
		br.close();
	}

}
