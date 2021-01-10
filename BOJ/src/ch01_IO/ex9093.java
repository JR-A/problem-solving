package ch01_IO;

//�ܾ� ������
/*
����
������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, ������ �ϳ� �־�����. 
�ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.

���
�� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.
*/

import java.io.*;
import java.util.*;

public class ex9093 {

	public static void main(String[] args) throws IOException {
		//sol 1
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			String[] str = br.readLine().split(" ");

			for(int i=0; i<str.length; i++) {
				Stack<Character> stack = new Stack<>();
				
				for(int j=0; j<str[i].length(); j++) {
					stack.push(str[i].charAt(j));
				}
				for(int j=0; j<str[i].length(); j++) {
					bw.write(stack.pop());
				}
				bw.write(" ");
			}
		}
		
		bw.flush();
		br.close();
		*/
		
		//sol 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String str = br.readLine() + "\n";
			Stack<Character> s = new Stack<>();
			
			for(char ch : str.toCharArray()) {
				if(ch == '\n' || ch == ' ') {
					while(!s.isEmpty()) {
						bw.write(s.pop());
					}
					bw.write(ch);
				}else {
					s.push(ch);
				}
			}
			
		}
		
		bw.flush();
		br.close();
		
	}

}
