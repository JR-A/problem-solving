package ch01_IO;

//단어 뒤집기
/*
문제
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.

출력
각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
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
