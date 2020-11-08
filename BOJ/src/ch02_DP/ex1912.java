package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//������
public class ex1912 {

	public static void main(String[] args) throws IOException {
		int d[]; //d[i]: i��° ���� ������ ��� ���� ū ������. (i��° ���� ���Ե�)
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
			//���ο� ������ �����ϴ°��,i-1��° ���� �����տ� ���ԵǴ� ���
			d[i] = Math.max(arr[i], d[i-1]+arr[i]);
		}
		
		Arrays.sort(d);
		System.out.println(d[N-1]);
		
		br.close();
	}

}
