package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

//���� �� �����ϴ� �κ� ����
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
				if(arr[j]<arr[i]) {	//j�� ������ ���� i�� ������ ������ �۰�(��������)
					if(d[j]>d[i] && d[j]>d[max]) { //d[j]���� d[i]������ Ŀ���Ѵ�(���� �� ����)
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
	   	�Է�
		8
		1 2 4 3 3 4 2 1
		    
		��
		4
	 */

}