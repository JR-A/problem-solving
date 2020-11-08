package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//연속합
public class ex1912 {

	public static void main(String[] args) throws IOException {
		int d[]; //d[i]: i번째 수로 끝나는 경우 가장 큰 연속합. (i번째 수가 포함된)
		int arr[];
		int N;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		d = new int[N];
		d[0] = arr[0];
		for(int i=1; i<N; i++) {
			//새로운 연속합 시작하는경우,i-1번째 수의 연속합에 포함되는 경우
			d[i] = Math.max(arr[i], d[i-1]+arr[i]);
		}
		
		Arrays.sort(d);
		System.out.println(d[N-1]);
		
		br.close();
	}

}
