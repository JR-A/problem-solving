package ch05_Greedy;

//ķ��
/*
	����
	��갡 �谭���� ������� �Բ� ķ���� ������. ������, ķ���忡�� ������ ���� ����� ���� �־���.
	ķ������ �����ϴ� 20�� �� 10�ϵ��ȸ� ����� �� �ֽ��ϴ�.
	�����̴� ���� �� 28�� �ް��� �����ߴ�. �̹� �ް� �Ⱓ ���� �����̴� ķ������ ��ĥ���� ����� �� ������?
	�����̴� ���� �� �Ϲ�ȭ�ؼ� ������ Ǯ���� �Ѵ�. 
	ķ������ �����ϴ� P�� ��, L�ϵ��ȸ� ����� �� �ִ�. �����̴� ���� �� V��¥�� �ް��� �����ߴ�. �����̰� ķ������ �ִ� ��ĥ���� ����� �� ������? (1 < L < P < V)
	
	�Է�
	�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, L, P, V�� ������� �����ϰ� �ִ�. ��� �Է� ������ int�����̴�. 
	������ �ٿ��� 0�� 3�� �־�����.
	
	���
	�� �׽�Ʈ ���̽��� ���ؼ�, �����̰� ķ������ �ִ� ��ĥ���� ����� �� �ִ��� ���� ���ó�� ����Ѵ�.
	
	���� �Է� 1 
	5 8 20
	5 8 17
	0 0 0
	
	���� ��� 1 
	Case 1: 14
	Case 2: 11
 */

import java.io.*;
import java.util.*;

public class ex4796 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		
		while( true ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			if( L == 0 && P == 0 && V == 0 ) break;
			
			System.out.println("Case " + cnt + ": " + camp(L,P,V));
			
			cnt++;
		}
		
		br.close();
	}
	
	public static int camp(int L, int P, int V) {
		int day = 0;
		
		while(V > 0) {
			if( P <= V ) {
				V -= P;
				day += L;
			}else {
				if( V >= L ) day += L;
				else day += V;
				break;
			}
		}
		
		return day;
	}
	
}
