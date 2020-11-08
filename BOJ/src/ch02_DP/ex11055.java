package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex11055 {

	public static void main(String[] args) throws IOException {
		int d[];
		int arr[];
		int N;
		int maxSum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		d = new int[N];
		arr = new int[N];
		
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		for(int i=0; i<N; i++) {
			d[i] = arr[i];
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j] && arr[i]+d[j]>d[i]) {
					d[i] = d[j] + arr[i];
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			if(d[i]>maxSum) {
				maxSum = d[i];
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(d));
		System.out.println(maxSum);
		br.close();
	}

}
