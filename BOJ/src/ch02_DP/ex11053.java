package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

//가장 긴 증가하는 부분 수열
public class ex11053 {

	public static void main(String[] args) throws IOException {
		int[] d;
		int[] arr;
		int N;
		int max = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		d = new int[N];
		
		
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i=0; i<N; i++) {
			max = i;
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) {	//j번 수열의 값이 i번 수열의 값보다 작고(증가수열)
					if(d[j]>d[i] && d[j]>d[max]) { //d[j]값이 d[i]값보다 커야한다(가장 긴 수열)
						max = j;
					}
				}
			}
			d[i] = d[max] + 1;
		}
		
		max=0;
		for(int i=1; i<N; i++) {
			if(d[i]>d[max]) {
				max = i;
			}
		}
		System.out.println(d[max]);
		br.close();
	}
	
	/*
	   	입력
		8
		1 2 4 3 3 4 2 1
		    
		답
		4
	 */

}
