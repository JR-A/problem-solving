package ch04_Brute_force;

import java.io.*;

//������
public class ex2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 1, sum = 0, n = 0;

		for(i=1; i<N; i++) {
			//������ ���ϱ� (�������� N�� N�� �� �ڸ����� ��)
			sum = i;
			n = i;
			while(n != 0) {	
				sum += (int)n%10;
				n /= 10;
			}
			if(sum == N) {
				System.out.println(i);
				break;
			}
		}
		//�������� �������� �ʴ� ��� 0 ���
		if(i==N) System.out.println(0);	
		
		br.close();
	}

}
