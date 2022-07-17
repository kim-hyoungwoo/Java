package bakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sort {
	
	/**
	 * <br>
	 * 백준 알고리즘 (정렬) 2750번 ->  삽입정렬 활용  <br>
	 * https://www.acmicpc.net/problem/2750
	 * <br>
	 */
	public void problem_2750(BufferedReader br, BufferedWriter bw, StringTokenizer st) throws IOException {

		int number = 0;
		number = Integer.parseInt(st.nextToken());
		int[] array = new int[number];
		// 임시 인덱스
		int j;
		// 임시 array 
		int temp;
		
		for (int i = 0; i < number; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < array.length-1; i++) {
			// 현재 선택한 원소를 적절한 위치에 넣어주기 위한 임시 인덱스 저장 
			j = i;
			while (j >= 0 && array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	/**
	 * <br>
	 * 백준 알고리즘 (정렬) 2751번 -> 퀵정렬 활용 <br>
	 * https://www.acmicpc.net/submit/2751
	 * <br>
	 */
	
	public void problem_2751(BufferedReader br, BufferedWriter bw, StringTokenizer st) throws IOException {
		
		// N 개의 수
		int num = Integer.parseInt(st.nextToken());
		int[] array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		
		
	}
}
