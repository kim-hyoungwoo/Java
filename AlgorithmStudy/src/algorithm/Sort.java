package algorithm;

public class Sort {
	/**
	 * 선택 정렬 (Selection Sort)<br>
	 * https://youtu.be/8ZiSzteFRYc
	 */
	public void selectionSort() {
		int min = 0;
		int index = 0;
		int temp = 0;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for (int i = 0; i < array.length; i++) {
			// 항상 최소값을 선택해야하기 때문에 큰값을 넣어준다. 
			min = 9999;
			for (int j = i; j < array.length; j++) {
				// 현재 탐색하고있는것이 대상보다 작다면 min 변경 및 해당 인덱스 저장 
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			// 원소 스와핑 진행
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(int i : array) {
			System.out.print(i);
		}
	}
	
	/**
	 * 버블 정렬 (Bubble Sort)<br>
	 * https://youtu.be/EZN0Irp2aPs
	 */
	public void bubbleSort() {
		int temp = 0;
		
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for (int i = 0; i < array.length; i++) {
			// 뒤에서 부터 집합의 크기를 감소시키면서 비교해야하므로 
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i);
		}
	}
	
	/**
	 * 삽입 정렬 (Insertion Sort)<br>
	 * https://youtu.be/16I9Z7bS1iM
	 */
	public void insertionSort() {
		
		int temp = 0;
		int j = 0;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(int i = 0; i < array.length-1; i++) {
			j = i;
			while (j > 0 && array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		for (int i : array) {
			System.out.print(i);
		}
	}
	
	/**
	 * 퀵 정렬(quick sort)<br>
	 * https://youtu.be/O-O-90zX-U4
	 */
	public void quickSort(int[] data, int start, int end) {
		// 원소가 1개인 경우 
		if (start >= end) {
			return;
		}
		// 피벗 값 설정 
		int key = start; // 키는 첫번째 원소 
		int i = start + 1; // 왼쪽 출발지점
		int j = end; // 오늘쪽 출발지점 
		int temp;
		//  && 
		while (i <= j) { // 엇갈릴 때까지 반복 
			while (i <= end && data[i] <= data[key]) { // 키 값보다 큰 값을 만날때 까지 
				i++;
			}
			while (j > start && data[j] >= data[key]) { // 키 값보다 작은 값을 만날때 까지 
				j--;
			}
			if (i > j) { // 현재 엇갈린 상태면 키 값과 교채 
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			}
			else { // 다했는데도 엇갈리지 않았다면 교체 
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
			
		}
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
	
	/**
	 * 병합 정렬(Merge sort)<br>
	 * https://youtu.be/ctkuGoJPmAE
	 */
	public void mergeSort(int[] array, int start, int end) {
		// 정중앙을 기점으로 배열을 나눈다. 
		// 크기가 1보다 큰 경우
		if (start < end) {
			// 정중앙 을 가르키는것
			int middle = (start + end) / 2;
			mergeSort(array, start, middle);
			mergeSort(array, middle+1, end);
			
			//나중에 합쳐서 정렬한다. 
			mergeSort_1(array, start, middle, end);
		}
	}
	
	public void mergeSort_1(int[] array, int start, int middle, int end) {
		
		int number = 8;
		int[] sorted = new int[number]; // 정렬 배열은 반드시 전역 변수로 선언
		
		// 첫번째 배열의 비교 대상
		int i = start;
		// 두번째 배열의 비교 대상
		int j = middle + 1;
		// 비교해서 넣는 값
		int k = start;
		
		// 작은 순서대로 배열에 삽입
		while (i <= middle && j <= end) {
			if (array[i] <= array[j]) {
				sorted[k] = array[i];
				i++;
			}
			else {
				sorted[k]  = array[j];
				j++;
			}
			k++;
		}
		
		// 남은 데이터도 삽입
		// i가 먼저 끝난 경우
		if (i > middle) {
			for (int t = j; t <= end; t++) {
				sorted[k] = array[t];
				k++;
			}
		}
		// j가 먼저 끝난 경우
		else {
			for(int t = i; t <= middle; t++) {
				sorted[k] = array[t];
				k++;
			}
		}
		// 정렬된 배열을 삽입
		for (int t = start; t <= end; t++) {
			array[t] = sorted[t];
		}
	}
	
	/**
	 * 힙 정렬 (Heap Sort)<br>
	 * https://youtu.be/iyl9bfp_8ag
	 */
	public void heapSort(int num, int[] heap) {
		// 먼저 전체 트리 구조를 최대 힙 구조로 바꾼다.
		for (int i = 0; i < num; i++) {
			int current = i;
			do {
				// root 는 지금 자신의 -1 을 하고 2로 나누면 나온다.
				int root = (current - 1) / 2;
				// 부모의 값이 자식의 값보다 크다면
				if (heap[root] < heap[current]) {
					int temp = heap[root];
					heap[root] = heap[current];
					heap[current] = temp;
				}
				current = root;
			} while (current != 0);
		}
		// 크기를 줄여가며 반복적으로 힙을 구성
		for (int i = num - 1; i >= 0; i--) {
			// 0번의 인덱스 값과 마지막 값을 바꿔 정렬한다. 
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			// 초기화
			int root = 0;
			// 현재 위치
			int current = 1;
			do {
				//root 의 자식 계산
				current = 2 * root + 1;
				
				// 자식 중에 더 큰 값을 찾는다. 
				// 오른쪽과 왼쪽을 비교했을때 어떤게 더 큰지 비교해서 root 랑 비교
				if (current < i-1 && heap[current] < heap[current + 1]) {
					current++;
				}
				// 루트보다 자식이 더 크다면 교환
				if (heap[root] < heap[current] && current < i ) {
					int temp2 = heap[root];
					heap[root] = heap[current];
					heap[current] = temp2;
				}
				root = current;
			} while (current < i);
		}
	}
}
