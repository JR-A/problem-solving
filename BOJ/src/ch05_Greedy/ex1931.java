/*
ȸ�ǽ� ����
����
�� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǿ� ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. 
�� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� ȸ���� �ִ� ������ ã�ƺ���. 
��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�. 
ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�. �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.

�Է�
ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����. 
��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����. 
���� �ð��� ������ �ð��� 231-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

���
ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.
 */
package ch05_Greedy;

import java.io.*;
import java.util.*;

public class ex1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] times = new int[N][2];
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			times[i][0] = Integer.parseInt(st.nextToken());	//ȸ�� ���� �ð�
			times[i][1] = Integer.parseInt(st.nextToken()); //ȸ�� ���� �ð�
		}
		
		//������ �ð��� �������� �������� �����ϱ� ���� compare ������
		Arrays.sort(times, new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				//����ð��� ���� ��� �ð��ð��� ���� ������ ����
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
					
				return o1[1] - o2[1];
			}
			
		});
		
		int prev_end = 0;
		
		for(int i=0; i<N; i++) {
			//���� ����ð��� ���� ȸ�� ���۽ð����� �۰ų� ������ ����
			if(prev_end <= times[i][0]) {
				prev_end = times[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}

}
