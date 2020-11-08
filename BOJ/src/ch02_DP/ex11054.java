package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//가장 긴 바이토닉 부분 수열
public class ex11054 {

	public static void main(String[] args)throws IOException {
		int[] d;
		int[] LIS;
		int[] LDS;
		int[] arr;
		int N;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		arr = new int[N];
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		//LIS(가장 긴 증가 부분수열) 구하기
		LIS = new int[N];
		Arrays.fill(LIS, 1);	
		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i] && LIS[j]>=LIS[i]) {
					LIS[i] = LIS[j] + 1;
				}
			}
		}	
		
		//LDS(가장 긴 감소 부분수열) 구하기
		LDS = new int[N];
		Arrays.fill(LDS, 1);
		for(int i=N-2; i>=0; i--) {
			for(int j=N-1; j>i; j--) {
				if(arr[j]<arr[i] && LDS[j]>=LDS[i]) {
					LDS[i] = LDS[j] + 1;
				}
			}
		}
		
		d = new int[N];
		for(int i=0; i<N; i++) {
			d[i] = LIS[i] + LDS[i];
		}
		Arrays.sort(d);
		
		System.out.println(d[N-1]-1);
		
	}

}
