package bakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
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
	 * 백준 알고리즘 (정렬) 2750번 -> 퀵정렬 활용 <br>
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
		
		//Arrays.sort(array);
		
		problem_2751_1(array, 0, array.length-1);
		
		for(int i : array) {
			bw.write(i + "\n");
			bw.flush();
		}
		bw.close();
		
	}
	
	public void problem_2751_1 (int[] data, int start, int end) {
		
		// 원소의 개수가 한개일 경우
		if (start >= end) {
			return;
		}
		
		// 피벗 값 설정
		int key = start;
		// 검색 start 부분 설정
		int i = start + 1;
		// 검색 end 부분 설정
		int j = end;
		// 임시 저장
		int temp;
		
		while (i <= j) {// 검색하는게 엇갈리면 Stop
			while (i <= end && data[i] <= data[key]) { // 키 값보다 대상값이 크면 break;
				i++;
			}
			while (j > start && data[j] <= data[key]) { //키 값보다 대상값이 작으면 break;
				j--;
			}
			if (i > j) {// 오른쪽 부터 검색 대상과 왼쪽부터 검색 대상이 엇갈렸다면 키값과 교체
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}
			else { // 오른쪽 부터 검색 대상과 왼쪽부터 검색 대상이 엇갈리지 않았다면 start와 end 교체
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		
		problem_2751_1(data, start, j-1);
		problem_2751_1(data, j+1, end);
	}
	
	/**
	 * <br>
	 * 백준 알고리즘_10989 -> 힙정렬 활용
	 * https://www.acmicpc.net/problem/10989
	 * <br>
	 * @param br
	 * @param bw
	 * @param st
	 * @throws IOException
	 */
	public void problem_10989(BufferedReader br, BufferedWriter bw, StringTokenizer st) throws IOException {
		int number = Integer.parseInt(st.nextToken());
		
		int[] array = new int[number];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// 완전 힙 구조 만들기 
		for (int i = 0; i < array.length; i++) {
			// 비교 target
			int current = i;
			// 현재 target 이 root(0번인덱스) 가 아니면
			while (current != 0) {
				// 현재 target의 root
				int root = (current - 1) / 2;
				// root 가 현재 target 보다 작다면
				if (array[current] > array[root]) {
					int temp = array[current];
					array[current] = array[root];
					array[root] = temp;
				}
				current = root;
			}
		}
		
		// length-1 인 이유는 맨 첫번째 노드랑 마지막 노드를 바꿔서 sort 해주기 때문에
		for (int i = array.length-1; i >= 0; i--) {
			//root 의 있는 가장 큰 값을 가장 하단으로 내린뒤 그 노드 빼고 다시 계산
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			int root = 0;
			int current = 1;
			
			while (current < i) {
				current = 2 * root + 1;
				
				if (current < i-1 && array[current] < array[current + 1]) {
					current++;
				}
				
				if (current < i && array[root] < array[current]) {
					int temp2 = array[root];
					array[root] = array[current];
					array[current] = temp2;
				}
				root = current;
			}
		}
		
		for (int i : array) {
			bw.write(i + "");
			bw.flush();
		}
		
	}
}
