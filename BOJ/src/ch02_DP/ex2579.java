package ch02_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��� ������
public class ex2579 {
	public static void main(String[] args) throws IOException {
		int d[] = new int[300];		//d[i] : i��° ��ܱ��� ���� �� �ִ� �ִ� ����. �� i��° ��� ���� ����(i��° ��� ���)
		int step[] = new int[300];
		int N;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N ;i++) step[i] = Integer.parseInt(br.readLine());
		
		
		d[0] = step[0];
		d[1] = step[1] + step[0];
		d[2] = Math.max(step[2]+step[0], step[2]+step[1]);
		for(int i=3; i<N; i++) {
			d[i] = Math.max(step[i] + step[i-1] + d[i-3], step[i] + d[i-2]);
		}

		System.out.println(d[N-1]);
		br.close();
	}
}
